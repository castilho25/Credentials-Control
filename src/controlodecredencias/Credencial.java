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
public class Credencial implements Serializable{
    private long codigo;
    private String nome;
    private Data datapartida;
    private Data datachegada;
    private Viatura viatura;
    public Credencial(long codigo, String nome, Data datapartida, Data datachegada,Viatura viatura){
        this.nome = nome;
        this.datapartida = datapartida;
        this.datachegada = datachegada;
        this.viatura = viatura;
        this.codigo = codigo;
    }
    public long getCodigo(){
        return codigo;
    }
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Data getDataPartida(){
        return datapartida;
    }
    public void setDataPartida(Data datapartida){
        this.datapartida = datapartida;
    }
    public Data getDataChegada(){
        return datachegada;
    }
    public void setDataChegada(Data datachegada){
        this.datachegada = datachegada;
    }
    public Viatura getViatura(){
        return viatura;
    }
    public void setViatura(Viatura viatura){
        this.viatura = viatura;
    }
}
