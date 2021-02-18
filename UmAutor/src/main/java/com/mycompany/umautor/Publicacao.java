package com.mycompany.umautor;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anderson, Lucas, Luís e Maycon
 */
public class Publicacao {
    
    public int id;
    public String titulo;
    public int paginaInicial;
    public int paginaFinal;
    public int anoPublicacao;
    public List autor;
    
    Publicacao(int newId, String newTitulo, int newPaginaInicial, int newPaginaFinal, int newAnoPublicacao, List newAutor){
        this.id = newId;
        this.titulo = newTitulo;
        this.paginaInicial = newPaginaInicial;
        this.paginaFinal = newPaginaFinal;
        this.anoPublicacao = newAnoPublicacao;
        this.autor = newAutor;
    }
    
    public String format(Collection<?> c) {
        String s = c.stream().map(Object::toString).collect(Collectors.joining(","));
        return String.format("[%s]", s);
    }
    
    public String retornaPubli() {
        //Object listString = autor.stream().map(Object::toString).collect(Collectors.joining(", "));
        //return ("[" + id + "," + titulo + "," + paginaInicial + "," + paginaFinal + "," + anoPublicacao + "," + format() + "]");
        return format(autor);
    }

    
}
