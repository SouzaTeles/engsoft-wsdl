/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.umautor;

/**
 *
 * @author Paco
 */
public class Autor {
    
    public int id;
    public String cpf;
    public String nome;
    
    public Autor (int newId, String newCpf, String newNome) {
        this.id = newId;
        this.cpf = newCpf;
        this.nome = newNome;
    }
    
    public String retornaAutor() {
        return (id + "," + cpf + "," + nome);
    }
}

