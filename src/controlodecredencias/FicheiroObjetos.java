/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlodecredencias;
import static controlodecredencias.ControlodeCredencias.dados;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author João
 */
public class FicheiroObjetos {
        private ObjectOutputStream oS;
        private ObjectInputStream iS;
    
    public boolean abreLeitura(String nomeDoFicheiro) {
        try{
            iS = new ObjectInputStream(new FileInputStream(nomeDoFicheiro));
            return true;
        } catch (IOException e){
               return false;
        }
    }
    public void abreEscrita(String nomeDoFicheiro) throws IOException{
        oS = new ObjectOutputStream(new FileOutputStream(nomeDoFicheiro));
    }
    public Object leObjecto() throws IOException,ClassNotFoundException{
        return iS.readObject();
    }
    public void escreveObjecto(Object o) throws IOException{
        oS.writeObject(o);
    }
    public void fechaLeitura() throws IOException{
        iS.close();
    }
    public void saveData(){
        BufferedReader reader = null;
        String line;
        File file;
            try {
                file = new File("copiaVeiculos.txt");
                reader = new BufferedReader(new FileReader(file));
                ArrayList<Viatura> viaturas = dados.getListaViaturas();
                while((line=reader.readLine())!=null){
                    for(int i=0;i<viaturas.size();i++){
                        if(viaturas.get(i).getNumero() > Integer.parseInt(line)){
                            viaturas.add(i,new Viatura(Integer.parseInt(line)));
                            break;
                        }
                            

                    }
                }
                dados.setListaViaturas(viaturas);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                file = new File("copiaUtentes.txt");
                reader = new BufferedReader(new FileReader(file));
                ArrayList<String> utentes = dados.getListaUtentes();
                while((line=reader.readLine())!=null){
                    utentes.add(line);
                }
                dados.setListaUtentes(utentes);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                file = new File("copiaCredenciais.txt");
                reader = new BufferedReader(new FileReader(file));
                ArrayList<Credencial> credenciais = dados.getListaCredenciais();
                String[] tokens = new String[5];
                Credencial credencial = null;
                ArrayList<Viatura> viaturas = dados.getListaViaturas();
                Viatura viatura;
                int i;
                boolean found;
                while((line=reader.readLine())!=null){
                    found = false;
                    tokens = line.split("::");
                    if(tokens.length==5){
                        viatura = new Viatura(Integer.parseInt(tokens[2]));
                        for(i=0;i<viaturas.size();i++){
                            if(viaturas.get(i).getNumero()==viatura.getNumero()){
                                found = true;
                                viatura = viaturas.get(i);
                                break;
                            }
                            if(viaturas.get(i).getNumero()>viatura.getNumero()){
                                break;
                            }   
                        }

                        credencial = new Credencial(Long.parseLong(tokens[0]),tokens[1],new Data(tokens[3]),new Data(tokens[4]),viatura);
                        adicionacredencialviatura(viatura,credencial);
                        if(!found)
                            viaturas.add(i,viatura);
                        else{
                            viaturas.set(i,viatura);
                        }
                        credenciais.add(credencial);
                    }
                }
                dados.setListaViaturas(viaturas);
                dados.setListaCredenciais(credenciais);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(FicheiroObjetos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        AtualizaFicheiros();
    }
        private void AtualizaFicheiros(){
        try{
            abreEscrita("dados.bin");
            escreveObjecto((BaseDados)dados);
            fechaEscrita();
        }
        catch (Exception ex){         
            System.out.printf("Não foi possível escrever os dados no ficheiro! Exception found: %s\n",ex);
        }
    }
    private void adicionacredencialviatura(Viatura viatura,Credencial credencial){
        ArrayList<Credencial> listacredenciais = viatura.getListaCredenciais();
        int i=0;
        if(listacredenciais.size()>0){
            for(i=0;i<listacredenciais.size();i++){
                if(listacredenciais.get(i).getCodigo()>credencial.getCodigo()){
                    break;
                }
            }
        }
        listacredenciais.add(i,credencial);
        viatura.setListaCredenciais(listacredenciais);
        ArrayList<Viatura> listaviaturas = dados.getListaViaturas();
        for(int j=0;j<listaviaturas.size();j++){
            if(listaviaturas.get(j).getNumero()==viatura.getNumero()){
                listaviaturas.set(j,viatura);
                break;
            }
        }
        dados.setListaViaturas(listaviaturas);
    }
    public void makeCopia() throws IOException{
        File file  = new File("copiaVeiculos.txt");
        PrintWriter writer = new PrintWriter(file);
        ArrayList<Viatura> viaturas = dados.getListaViaturas();
        for(int i=0;i<dados.getListaViaturas().size();i++){
            writer.println(viaturas.get(i).getNumero());
        }
        writer.close();
        file = new File("copiaUtentes.txt");
        writer = new PrintWriter(file);
        ArrayList<String> utentes = dados.getListaUtentes();
        for(int i=0;i<dados.getListaUtentes().size();i++){
            writer.println(utentes.get(i));
        }
        writer.close();
        file = new File("copiaCredenciais.txt");
        writer = new PrintWriter(file);
        ArrayList<Credencial> credenciais = dados.getListaCredenciais();
        for(int i=0;i<dados.getListaCredenciais().size();i++){
            writer.println(credenciais.get(i).getCodigo() + "::" + credenciais.get(i).getNome() + "::" + credenciais.get(i).getViatura().getNumero() + "::" + credenciais.get(i).getDataPartida().getCodigoTotal() + "::" + credenciais.get(i).getDataChegada().getCodigoTotal());
        }
        
        
    }
    public void fechaEscrita() throws IOException{
        oS.close();
    }    
}
