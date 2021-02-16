/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.umautor;

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
    
    

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Retornando uma publicação
     */
    @WebMethod(operationName = "PesquisaPubli")
    public Publicacao retornaPubli(@WebParam(name = "titulo") String tituloPubli) {
        Publicacao livroUm = new Publicacao(1,tituloPubli,1,10,2010,"Mike Mignola");
        //return "O livro é " + tituloPubli + " !";
        System.out.println(livroUm.autor);
        
    }
}
