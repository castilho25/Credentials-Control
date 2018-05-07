/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlodecredencias;

import java.io.Serializable;

/**
 *
 * @author João
 */
public class Utente implements Serializable{
    private String nome;
    public Utente(String nome){
       this.nome = nome; 
    }
    private String getNome(){
        return this.nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }
}
