/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.umautor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Anderson, Lucas, Luís e Maycon
 */
@WebService(serviceName = "PesquisaPublicacao")
public class PesquisaPublicacao {
    
    //Criando e "armazenando" os autores
    Autor autor1 = new Autor(1,"22222222222","Mike Mignola");
    Autor autor2 = new Autor(1,"33333333333","John Byrne");
    Autor autor3 = new Autor(1,"44444444444","Neil Gaiman");
    Autor autor4 = new Autor(1,"55555555555","Dave McKean");

    List<Autor> listaDeAutores1 = new ArrayList<>();
    List<Autor> listaDeAutores2 = new ArrayList<>();

    //"Armazenando" as publicações
    Publicacao publicacao1 = new Publicacao(1,"Hellboy: Seed of Destruction",1,120,1994,listaDeAutores1);
    Publicacao publicacao2 = new Publicacao(2,"Coraline",1,186,2002,listaDeAutores2);
    Publicacao publicacao3 = new Publicacao(3,"Cobra Coral",1,186,2002,listaDeAutores2);

    //importante não colocar o *VOID* aqui! Senão a lista de autores fica vazia!
    public PesquisaPublicacao() {
        //agrupando os autores
        //Publicação 1
        listaDeAutores1.add(autor1);
        listaDeAutores1.add(autor2);
        //Publicação 2
        listaDeAutores2.add(autor3);
        listaDeAutores2.add(autor4);
    }

    /**
     * Retornando uma publicação
     */
    @WebMethod(operationName = "retornaPubli")
    public List<Publicacao> retornaPubli(@WebParam(name = "titulo") String tituloPublicacao) {
        //return tituloPubli;
        //return pub1.retornaPubli()+pub2.retornaPubli();
        
        List<Publicacao> listaPublicacao = new ArrayList<>();
        listaPublicacao.add(publicacao1);
        listaPublicacao.add(publicacao2);
        listaPublicacao.add(publicacao3);
      
        return listaPublicacao.stream()
             .filter(p -> p.titulo.contains(tituloPublicacao))
             .collect(Collectors.toList());
    }
}