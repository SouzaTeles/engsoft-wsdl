/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.umautor;

import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Anderson, Lucas, Luís e Maycon
 */
@WebService(serviceName = "PesquisaPublicacao")
public class PesquisaPubli {
    
    //Criando e "armazenando" os autores
    Autor aut1 = new Autor(1,"22222222222","Mike Mignola");
    Autor aut2 = new Autor(1,"33333333333","John Byrne");
    Autor aut3 = new Autor(1,"44444444444","Neil Gaiman");
    Autor aut4 = new Autor(1,"55555555555","Dave McKean");
    
    List<Autor> listaDeAutores1 = new ArrayList<>();
    List<Autor> listaDeAutores2 = new ArrayList<>();
    
    //agrupando os autores
    public ArrayList agrupaAutores() {
        //Publicação 1
        listaDeAutores1.add(aut1);
        listaDeAutores1.add(aut2);
        //Publicação 2
        listaDeAutores2.add(aut3);
        listaDeAutores2.add(aut4);
        
        return null;
    }
    
    
    //"Armazenando" as publicações
    //Publicacao pub1 = new Publicacao(1,"Hellboy: Seed of Destruction",1,120,1994,"Mike Mignola");
    Publicacao pub1 = new Publicacao(1,"Hellboy: Seed of Destruction",1,120,1994,listaDeAutores1);
    Publicacao pub2 = new Publicacao(2,"Coraline",1,186,2002,listaDeAutores2);

    
    /**
     * Retornando uma publicação
     */
    @WebMethod(operationName = "retornaPubli")
    public String retornaPubli(@WebParam(name = "titulo") String tituloPubli) {
        //return tituloPubli;
        
        
        return pub1.retornaPubli()+pub2.retornaPubli();
        //return pub1.autor + pub2.autor;
    }
}
