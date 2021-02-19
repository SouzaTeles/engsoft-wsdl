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
public class PesquisaPublicacao {
    
    private Publicacao publicacao;
   
    public PesquisaPublicacao()
    {
        Autor autor = new Autor();
        autor.setCpf("158.258.336-47");
        autor.setNome("Maycon Oliveira");
        autor.setId(1);
        
        Autor autor1 = new Autor();
        autor1.setCpf("158.258.336-37");
        autor1.setNome("Luis");
        autor1.setId(2);
        
        ArrayList<Object> autores = new ArrayList<>();
        autores.add(autor);
        autores.add(autor1);
        
        this.publicacao = new Publicacao();
        this.publicacao.setAnoPublicacao(2017);
        this.publicacao.setId(1);        
        this.publicacao.setPaginaInicial(1);
        this.publicacao.setPaginaFinal(100);
        this.publicacao.setTitulo("PHP");
        this.publicacao.setAutores(autores);
    }
    
    
    @WebMethod(operationName = "list")
    public List<Publicacao> list() {
       return (List<Publicacao>) this.publicacao;
    }
}
