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
 * Classe de pesquisa de publicações.
 * @author Anderson, Lucas, Luís e Maycon
 */
@WebService(serviceName = "PesquisaPublicacao")
public class PesquisaPublicacao {
    
    Publicacao publicacao1;
    Publicacao publicacao2;
    Publicacao publicacao3;
    Publicacao publicacao4;

    /**
     * Construtor responsável por adicionar as publicações e os autores as classes.
     * Neste projeto não foi utilizado BANCO DE DADOS, então não houve a necessidade de um DAO.
     */
    public PesquisaPublicacao() {
        
        Autor autor1 = new Autor();
        autor1.setId(1);
        autor1.setCpf("856.347.960-16");
        autor1.setNome("da Silva, A. F.");
        
        Autor autor2 = new Autor();
        autor2.setId(2);
        autor2.setCpf("164.948.870-07");
        autor2.setNome("Azevedo, L. G.");

        Autor autor3 = new Autor();
        autor3.setId(3);
        autor3.setCpf("898.765.330-70");
        autor3.setNome("Ohta, R. L.");
        
        Autor autor4 = new Autor();
        autor4.setId(4);
        autor4.setCpf("063.560.720-40");
        autor4.setNome("Binotto, A. P. D.");
        
        Autor autor5 = new Autor();
        autor5.setId(5);
        autor5.setCpf("830.084.880-05");
        autor5.setNome("dos Santos, M. N.");
        
        Autor autor6 = new Autor();
        autor6.setId(6);
        autor6.setCpf("412.052.340-39");
        autor6.setNome("Segura, V. C. V. B.");
        
        Autor autor7 = new Autor();
        autor7.setId(7);
        autor7.setCpf("098.256.390-67");
        autor7.setNome("Gandour, F. L.");
        
        Autor autor8 = new Autor();
        autor8.setId(8);
        autor8.setCpf("100.342.550-01");
        autor8.setNome("da Silva Jose, H. S. A.");
        
        Autor autor9 = new Autor();
        autor9.setId(9);
        autor9.setCpf("402.452.150-00");
        autor9.setNome("Cappelli, C.");
        
        Autor autor10 = new Autor();
        autor10.setId(10);
        autor10.setCpf("728.782.130-33");
        autor10.setNome("Santoro, F. M.");
        
        Autor autor11 = new Autor();
        autor11.setId(11);
        autor11.setCpf("153.503.130-10");
        autor11.setNome("De Bayser, M.");
        
        Autor autor12 = new Autor();
        autor12.setId(12);
        autor12.setCpf("169.725.400-46");
        autor12.setNome("Cerqueira, R.");
        
        Autor autor13 = new Autor();
        autor13.setId(13);
        autor13.setCpf("810.822.400-44");
        autor13.setNome("dos Santos, J. S.");
        
        Autor autor14 = new Autor();
        autor14.setId(14);
        autor14.setCpf("562.524.110-43");
        autor14.setNome("Soares, E. F.");
        
        Autor autor15 = new Autor();
        autor15.setId(15);
        autor15.setCpf("408.949.960-70");
        autor15.setNome("Thiago, R. M.");
        
        Autor autor16 = new Autor();
        autor16.setId(16);
        autor16.setCpf("409.275.680-12");
        autor16.setNome("da Silva, V. T.");
      
        //agrupando os autores por publicação
        //Publicação 1
        List<Autor> listaDeAutores1 = new ArrayList<>();
        listaDeAutores1.add(autor1);
        listaDeAutores1.add(autor2);
        listaDeAutores1.add(autor3);
        listaDeAutores1.add(autor4);
        listaDeAutores1.add(autor5);
        listaDeAutores1.add(autor6);
        listaDeAutores1.add(autor7);
        //Publicação 2
        List<Autor> listaDeAutores2 = new ArrayList<>();
        listaDeAutores2.add(autor8);
        listaDeAutores2.add(autor9);
        listaDeAutores2.add(autor10);
        listaDeAutores2.add(autor2);
        //Publicação 3
        List<Autor> listaDeAutores3 = new ArrayList<>();
        listaDeAutores3.add(autor11);
        listaDeAutores3.add(autor2);
        listaDeAutores3.add(autor12);
        //Publicação 4
        List<Autor> listaDeAutores4 = new ArrayList<>();
        listaDeAutores4.add(autor13);
        listaDeAutores4.add(autor2);
        listaDeAutores4.add(autor14);
        listaDeAutores4.add(autor15);
        listaDeAutores4.add(autor16);
        
        //criando as publicações e atribuindo as listas de autores
        this.publicacao1 = new Publicacao();
        this.publicacao1.setId(1);
        this.publicacao1.setTitulo("A cloud-based architecture for the internet of things targeting industrial engine remote monitoring.");
        this.publicacao1.setPaginaInicial(1);
        this.publicacao1.setPaginaFinal(6);
        this.publicacao1.setAnoPublicacao(2015);
        this.publicacao1.setAutores(listaDeAutores1);
        
        this.publicacao2 = new Publicacao();
        this.publicacao2.setId(2);
        this.publicacao2.setTitulo(" Implementation of aspect-oriented business process models with web services.");
        this.publicacao2.setPaginaInicial(1);
        this.publicacao2.setPaginaFinal(24);
        this.publicacao2.setAnoPublicacao(2020);
        this.publicacao2.setAutores(listaDeAutores2);
        
        this.publicacao3 = new Publicacao();
        this.publicacao3.setId(3);
        this.publicacao3.setTitulo("Researchops: The case for devops in scientific applications.");
        this.publicacao3.setPaginaInicial(1398);
        this.publicacao3.setPaginaFinal(1404);
        this.publicacao3.setAnoPublicacao(2015);
        this.publicacao3.setAutores(listaDeAutores3);
        
        this.publicacao4 = new Publicacao();
        this.publicacao4.setId(4);
        this.publicacao4.setTitulo("Analysis of tools for rest contract specification in swagger/openapi.");
        this.publicacao4.setPaginaInicial(201);
        this.publicacao4.setPaginaFinal(208);
        this.publicacao4.setAnoPublicacao(2020);
        this.publicacao4.setAutores(listaDeAutores4);
      
    }

    /**
     * Método responsável por retornar as publicações.
     * @param tituloPublicacao - Filtrar as publicações pelo titulo da publicação.
     * @return listaPublicacao
     */
    @WebMethod(operationName = "retornaPublicacao")
    public List<Publicacao> retornaPublicacao(@WebParam(name = "titulo") String tituloPublicacao) {

        //montando uma lista para pesquisarmos usando a string tituloPublicacao
        List<Publicacao> listaPublicacao = new ArrayList<>();
        listaPublicacao.add(this.publicacao1);
        listaPublicacao.add(this.publicacao2);
        listaPublicacao.add(this.publicacao3);
        listaPublicacao.add(this.publicacao4);
      
        //retornando o resultado da pesquisa
        return listaPublicacao.stream()
             .filter(p -> p.getTitulo().contains(tituloPublicacao))
             .collect(Collectors.toList());
    }
}