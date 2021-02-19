package com.mycompany.umautor;

import java.util.List;

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
    public List<Autor> autores;
    //public List<Autor> autores = new ArrayList<>();
    
    
    public Publicacao(int newId, String newTitulo, int newPaginaInicial, int newPaginaFinal, int newAnoPublicacao, List<Autor> newAutores){
        this.id = newId;
        this.titulo = newTitulo;
        this.paginaInicial = newPaginaInicial;
        this.paginaFinal = newPaginaFinal;
        this.anoPublicacao = newAnoPublicacao;
        this.autores = newAutores;
    }
    
    
    
    

}
