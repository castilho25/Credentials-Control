/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlodecredencias;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author João
 */
public class Viatura implements Serializable{
    private int numero;
    private ArrayList<Credencial> listacredenciais;
    public Viatura(int numero){
        this.numero=numero;
        this.listacredenciais = new ArrayList<>();
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public ArrayList<Credencial> getListaCredenciais(){
        return listacredenciais;
    }
    public void setListaCredenciais(ArrayList<Credencial> listacredenciais){
        this.listacredenciais = listacredenciais;
    }
}
