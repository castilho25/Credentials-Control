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
public class BaseDados implements Serializable{
    private ArrayList<Credencial> listacredenciais;
    private ArrayList<String> listautentes;
    private ArrayList<Viatura> listaviaturas;
    String[] inutil = new String[1];
    public BaseDados(){
        listautentes = new ArrayList<>();
        listaviaturas = new ArrayList<>();
        listacredenciais = new ArrayList<>();
    }
   /* public int getNumListaCredenciais(){
        return numlistacredenciais;
    }
    public int getNumListaViaturas(){
        return numlistaviaturas;
    }
    public int getNumListaUtentes(){
        return numlistautentes;
    }
    public void setNumListaUtentes(int numlistautentes){
        this.numlistautentes=numlistautentes;
    }
    public void setNumListaCredenciais(int numlistacredenciais){
        this.numlistacredenciais=numlistacredenciais;
    }
    public void setNumListaViaturas(int numlistaviaturas){
        this.numlistaviaturas=numlistaviaturas;
    }*/
    public ArrayList<Credencial> getListaCredenciais(){
        return listacredenciais;
    }
    public void setListaCredenciais( ArrayList<Credencial> listacredenciais){
        this.listacredenciais = listacredenciais;
    }
    public ArrayList<String>  getListaUtentes(){
        return listautentes;
    }
    public void setListaUtentes(ArrayList<String>  listautentes){
        this.listautentes = listautentes;
    }
    public ArrayList<Viatura>  getListaViaturas(){
        return listaviaturas;
    }
    public void setListaViaturas(ArrayList<Viatura>  listaviaturas){
        this.listaviaturas = listaviaturas;
    }
}
