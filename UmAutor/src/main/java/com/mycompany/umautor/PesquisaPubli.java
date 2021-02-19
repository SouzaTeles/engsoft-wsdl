/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.umautor;

import java.util.ArrayList;
import java.util.List;
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
    Publicacao publicacao1;
    Publicacao publicacao2;
    Publicacao publicacao3;
    
    //importante não colocar o *VOID* aqui! Senão a lista de autores fica vazia!
    public PesquisaPubli() {
       Autor autor1 = new Autor();
        autor1.setId(1);
        autor1.setCpf("22222222222");
        autor1.setNome("Mike Mignola");
        
        Autor autor2 = new Autor();
        autor2.setId(1);
        autor2.setCpf("3333333333");
        autor2.setNome("John Byrne");

        Autor autor3 = new Autor();
        autor3.setId(1);
        autor3.setCpf("3333333333");
        autor3.setNome("John Mignola");
        
        Autor autor4 = new Autor();
        autor4.setId(1);
        autor4.setCpf("22222222222");
        autor4.setNome("Mike");
      
        
        //agrupando os autores
        //Publicação 1
        List<Autor> listaDeAutores1 = new ArrayList<>();
        listaDeAutores1.add(autor1);
        listaDeAutores1.add(autor2);
        //Publicação 2
        List<Autor> listaDeAutores2 = new ArrayList<>();
        listaDeAutores2.add(autor3);
        listaDeAutores2.add(autor4);
        
        this.publicacao1 = new Publicacao();
        this.publicacao1.setId(1);
        this.publicacao1.setTitulo("Hellboy: Seed of Destruction");
        this.publicacao1.setPaginaInicial(1);
        this.publicacao1.setPaginaFinal(120);
        this.publicacao1.setAnoPublicacao(1994);
        this.publicacao1.setAutores(listaDeAutores1);
        
        this.publicacao2 = new Publicacao();
        this.publicacao2.setId(2);
        this.publicacao2.setTitulo("Coraline");
        this.publicacao2.setPaginaInicial(1);
        this.publicacao2.setPaginaFinal(186);
        this.publicacao2.setAnoPublicacao(2002);
        this.publicacao2.setAutores(listaDeAutores2);
        
        this.publicacao3 = new Publicacao();
        this.publicacao3.setId(3);
        this.publicacao3.setTitulo("Cobra Coral");
        this.publicacao3.setPaginaInicial(1);
        this.publicacao3.setPaginaFinal(186);
        this.publicacao3.setAnoPublicacao(2002);
        this.publicacao3.setAutores(listaDeAutores2);
      
    }
        
    /**
     * Retornando uma publicação
     */
    @WebMethod(operationName = "retornaPubli")
    public List<Publicacao> retornaPubli(@WebParam(name = "titulo") String tituloPubli) {
        //return tituloPubli;
        //return pub1.retornaPubli()+pub2.retornaPubli();
        
        List<Publicacao> lista = new ArrayList<>();
        lista.add(this.publicacao1);
        lista.add(this.publicacao2);
        
        return lista;
    }
}