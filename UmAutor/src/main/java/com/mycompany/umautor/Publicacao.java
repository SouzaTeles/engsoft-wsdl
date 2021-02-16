package com.mycompany.umautor;

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
    public static int id;
    public static String titulo;
    public static int paginaInicial;
    public static int paginaFinal;
    public static int anoPublicao;
    //public static int[] autores;
    public static String autor;
    
    Publicacao(){}
    
    Publicacao(int newId, String newTitulo, int newPaginaInicial, int newPaginaFinal, int newAnoPublicao, String newAutor){
        id = newId;
        titulo = newTitulo;
        paginaInicial = newPaginaInicial;
        paginaFinal = newPaginaFinal;
        anoPublicao = newAnoPublicao;
        autor = newAutor;
    }
}
