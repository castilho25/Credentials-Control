/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlodecredencias;

import controlodecredencias.FicheiroObjetos;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author João
 */
public class ControlodeCredencias {
    static Scanner stdin = new Scanner(System.in);
    static BaseDados dados = new BaseDados();
    static FicheiroObjetos fo = new FicheiroObjetos();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        try{
            if (fo.abreLeitura("dados.bin")) {
                dados = (BaseDados) fo.leObjecto();
                fo.fechaLeitura();
            
            }
        }
        catch (Exception ex) {
            System.out.printf("Não foi possível ler os dados do ficheiro! Exception found: %s\n",ex);
        }
        JFrame menuframe =new Menu();
        menuframe.setVisible(true);
        menuframe.pack();
     
    }
    
}
