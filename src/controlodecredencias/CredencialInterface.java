/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlodecredencias;
import static controlodecredencias.ControlodeCredencias.dados;
import static controlodecredencias.ControlodeCredencias.fo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author João
 */
public class CredencialInterface extends javax.swing.JFrame implements Serializable{
    private boolean existe=true;
    private Data datapartida;
    private Data datachegada;
    private Color red = new Color(255,71,71);
    private Color yellow = new Color(255,255,0);
    private Color[] disponibilidade = new Color[dados.getListaViaturas().size()];
    private boolean horachanged = false,minutochanged=false;
    /**
     * Creates new form CredencialInterface
     */
    public CredencialInterface() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                closeconfirm();
            }
        });
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        numerocredencial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        diaCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        mesCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        anoCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        horapartidaCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        minutopartidaCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        horachegadaCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        minutochegadaCombo = new javax.swing.JComboBox<>();
        dialabel = new javax.swing.JLabel();
        meslabel = new javax.swing.JLabel();
        anolabel = new javax.swing.JLabel();
        horapartidalabel = new javax.swing.JLabel();
        horachegadalabel = new javax.swing.JLabel();
        minutopartidalabel = new javax.swing.JLabel();
        minutochegadalabel = new javax.swing.JLabel();
        nomeUtenteComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nomeUtenteTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        viaturalabel = new javax.swing.JLabel();
        String[] viaturasString = new String[dados.getListaViaturas().size()];
        for(int i=0;i<dados.getListaViaturas().size();i++){
            viaturasString[i]=String.valueOf(dados.getListaViaturas().get(i).getNumero());
        }
        viaturaCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 470));
        setResizable(false);
        setSize(new java.awt.Dimension(550, 450));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inserir Credencial");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 20, 208, 28);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setVisible(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(314, 387, 90, 23);

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(413, 387, 70, 23);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Nº Credencial");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(41, 169, 95, 29);
        getContentPane().add(numerocredencial);
        numerocredencial.setBounds(154, 170, 167, 29);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Data");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 210, 40, 30);

        String[] auxdia = new String[31];
        for(int i=1;i<=31;i++){
            if(i<10){
                auxdia[i-1]="0"+i;
            }
            else
            auxdia[i-1]=String.format("%d", i);
        }
        diaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(auxdia));
        diaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                diaComboItemStateChanged(evt);
            }
        });
        getContentPane().add(diaCombo);
        diaCombo.setBounds(90, 210, 50, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 22));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("/");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 210, 10, 30);

        String[] auxmes = new String[12];
        for(int i=1;i<=12;i++){
            if(i<10)
            auxmes[i-1]="0"+i;
            else
            auxmes[i-1]=String.format("%d",i);
        }
        mesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(auxmes));
        getContentPane().add(mesCombo);
        mesCombo.setBounds(170, 210, 50, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 22));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("/");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 210, 10, 30);

        String[] auxano = new String[40];
        for(int i=0;i<40;i++){
            auxano[i]=String.format("%d",i+2010);
        }
        anoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(auxano));
        getContentPane().add(anoCombo);
        anoCombo.setBounds(250, 210, 60, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Hora de Chegada");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 290, 121, 30);

        String[] auxhorapartida = new String[24];
        for(int i=0;i<24;i++){
            if(i<10)
            auxhorapartida[i]="0"+i;
            else
            auxhorapartida[i]=String.format("%d",i);
        }
        horapartidaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(auxhorapartida));
        horapartidaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                horapartidaComboItemStateChanged(evt);
            }
        });
        getContentPane().add(horapartidaCombo);
        horapartidaCombo.setBounds(170, 250, 50, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 22));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(":");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 250, 10, 30);

        String[] auxminutopartida = new String[60];
        for(int i=0;i<60;i++){
            if(i<10)
            auxminutopartida[i]="0"+i;
            else
            auxminutopartida[i]=String.format("%d",i);
        }
        minutopartidaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(auxminutopartida));
        minutopartidaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                minutopartidaComboItemStateChanged(evt);
            }
        });
        getContentPane().add(minutopartidaCombo);
        minutopartidaCombo.setBounds(240, 250, 50, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Hora de Partida");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 250, 108, 30);

        String[] auxhorachegada = new String[24];
        for(int i=0;i<24;i++){
            if(i<10)
            auxhorachegada[i]="0"+i;
            else
            auxhorachegada[i]=String.format("%d",i);
        }
        horachegadaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(auxhorachegada));
        horachegadaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                horachegadaComboItemStateChanged(evt);
            }
        });
        getContentPane().add(horachegadaCombo);
        horachegadaCombo.setBounds(170, 290, 50, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 22));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(":");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 290, 10, 30);

        String[] auxminutochegada = new String[60];
        for(int i=0;i<60;i++){
            if(i<10)
            auxminutochegada[i]="0"+i;
            else
            auxminutochegada[i]=String.format("%d",i);
        }
        minutochegadaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(auxminutochegada));
        minutochegadaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                minutochegadaComboItemStateChanged(evt);
            }
        });
        getContentPane().add(minutochegadaCombo);
        minutochegadaCombo.setBounds(240, 290, 50, 30);

        dialabel.setFont(new java.awt.Font("Arial", 1, 22));
        dialabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(dialabel);
        dialabel.setBounds(90, 210, 50, 30);

        meslabel.setFont(new java.awt.Font("Arial", 1, 22));
        meslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(meslabel);
        meslabel.setBounds(170, 210, 50, 30);

        anolabel.setFont(new java.awt.Font("Arial", 1, 22));
        anolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(anolabel);
        anolabel.setBounds(250, 210, 50, 30);

        horapartidalabel.setFont(new java.awt.Font("Arial", 1, 22));
        horapartidalabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        horapartidalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(horapartidalabel);
        horapartidalabel.setBounds(170, 250, 50, 30);

        horachegadalabel.setFont(new java.awt.Font("Arial", 1, 22));
        horachegadalabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        horachegadalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(horachegadalabel);
        horachegadalabel.setBounds(170, 290, 50, 30);

        minutopartidalabel.setVisible(false);
        minutopartidalabel.setFont(new java.awt.Font("Arial", 1, 22));
        minutopartidalabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minutopartidalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(minutopartidalabel);
        minutopartidalabel.setBounds(240, 250, 50, 30);

        minutochegadalabel.setVisible(false);
        minutochegadalabel.setFont(new java.awt.Font("Arial", 1, 22));
        minutochegadalabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minutochegadalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(minutochegadalabel);
        minutochegadalabel.setBounds(240, 290, 50, 30);

        nomeUtenteComboBox.setVisible(true);
        ArrayList<String> utentes = dados.getListaUtentes();
        String[] utentesdisponiveis = new String[utentes.size()];
        if(utentes.size()!=0){
            for(int i=0;i<utentes.size();i++){
                utentesdisponiveis[i]=utentes.get(i);
            }
            nomeUtenteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(utentesdisponiveis));
        }
        nomeUtenteComboBox.setSelectedIndex(-1);
        nomeUtenteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nomeUtenteComboBoxItemStateChanged(evt);
            }
        });
        nomeUtenteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUtenteComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(nomeUtenteComboBox);
        nomeUtenteComboBox.setBounds(170, 90, 270, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nome do Utente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 90, 113, 29);

        jLabel2.setText("Utente não encontrado?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 130, 150, 20);

        jButton1.setText("Adicionar Utente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 130, 140, 23);

        nomeUtenteTextField.setVisible(false);
        nomeUtenteTextField.setText("");
        getContentPane().add(nomeUtenteTextField);
        nomeUtenteTextField.setBounds(170, 90, 269, 30);

        jButton4.setVisible(false);
        jButton4.setText("Verificar Utentes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 130, 140, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Verificar Viaturas Disponíveis");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(40, 330, 240, 22);

        jButton6.setVisible(false);
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Alterar Data");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(40, 330, 240, 22);

        viaturalabel.setVisible(false);
        viaturalabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        viaturalabel.setText("Viatura");
        getContentPane().add(viaturalabel);
        viaturalabel.setBounds(40, 370, 49, 30);

        viaturaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(viaturasString));
        viaturaCombo.setVisible(false);
        getContentPane().add(viaturaCombo);
        viaturaCombo.setBounds(120, 370, 50, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void closeconfirm(){
        int k=JOptionPane.showConfirmDialog(null,"Tem a certeza que deseja sair?");
        if(k==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    private void adicionarnovoutente(boolean novoutente){
        boolean opcao1=false,opcao2=true;
        if(novoutente){
            opcao1=true;
            opcao2=false;
        }
        existe = opcao2;
        nomeUtenteTextField.setVisible(opcao1);
        nomeUtenteComboBox.setVisible(opcao2);
        jButton1.setVisible(opcao2);
        jLabel2.setVisible(opcao2);
        jButton4.setVisible(opcao1);

    }   
    private void gotoMenu(){
        this.dispose();
        JFrame menu =new Menu();
        menu.setVisible(true);
        menu.pack();
    }
    private String verificaNome(){
        String nome;
        if(existe==false)
            nome = nomeUtenteTextField.getText();
        else{
            try{
            nome = nomeUtenteComboBox.getSelectedItem().toString();
            }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Por favor, escolha uma das opções dos utentes ou insira um novo utente!");
                 return null;
            }
        }
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null, "Nome inválido! Por favor insira/escolha um novo nome. ");
            return null;
        }
        ArrayList<String> listautentes = dados.getListaUtentes();
        int i=0;
        if(listautentes.size()>0){
            for(i=0;i<listautentes.size();i++){
                if(listautentes.get(i).equalsIgnoreCase(nome)){
                    return nome;
                }
                if(listautentes.get(i).compareToIgnoreCase(nome)>0)
                    break;
            }
        }
        listautentes.add(i,nome);
        dados.setListaUtentes(listautentes);
        return nome;
    }
    private long verificaCodigo(){
        long codigocredencial;
        try{
            codigocredencial = Long.parseLong(numerocredencial.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"O Número de Credencial apenas pode obter caracteres numéricos!");
            return -1;
        }
        return codigocredencial;
    }
    private Viatura verificaViatura(){
        if(viaturaCombo.getSelectedIndex()>-1){
            if(disponibilidade[viaturaCombo.getSelectedIndex()]==red){
                JOptionPane.showMessageDialog(null,"A viatura está indisponível nessa data. Por favor, altere a data ou a viatura!");
                return null;
            }
            else if(disponibilidade[viaturaCombo.getSelectedIndex()]==yellow){
                int j = JOptionPane.showConfirmDialog(null,"A Viatura, embora disponível já foi usada nesse dia. Deseja continuar?");
                if(j==JOptionPane.NO_OPTION)
                    return null;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Por favor, selecione uma viatura!");
            return null;
        }
        Viatura viatura = dados.getListaViaturas().get(viaturaCombo.getSelectedIndex());
        return viatura;
    }
    private void AtualizaFicheiros(){
        try{
            fo.abreEscrita("dados.bin");
            fo.escreveObjecto((BaseDados)dados);
            fo.fechaEscrita();
        }
        catch (Exception ex){         
            System.out.printf("Não foi possível escrever os dados no ficheiro! Exception found: %s\n",ex);
        }
    }
    private void atualizaData(){
        int dia = Integer.parseInt(dialabel.getText());
        datapartida = new Data(Integer.parseInt(dialabel.getText()),Integer.parseInt(meslabel.getText()),Integer.parseInt(anolabel.getText()),Integer.parseInt(horapartidalabel.getText()),Integer.parseInt(minutopartidalabel.getText()));
        if(!datapartida.segurancaData(false))
            JOptionPane.showMessageDialog(null,"A data não é válida, por favor altere para uma data correta!");
        if((Integer.parseInt(horachegadalabel.getText())<Integer.parseInt(horapartidalabel.getText()))||(Integer.parseInt(horachegadalabel.getText())==Integer.parseInt(horapartidalabel.getText()) && Integer.parseInt(minutochegadalabel.getText())<Integer.parseInt(minutopartidalabel.getText())))
            dia++;
        datachegada = new Data(dia,Integer.parseInt(meslabel.getText()),Integer.parseInt(anolabel.getText()),Integer.parseInt(horachegadalabel.getText()),Integer.parseInt(minutochegadalabel.getText()));
        datachegada.segurancaData(true);
    }
    private void GuardarAlteracoes(){

        long codigocredencial = verificaCodigo();
        if(codigocredencial==-1)
            return;
        Viatura viatura = verificaViatura();
        if(viatura==null)
            return;
        String nome = verificaNome();
        if(nome==null)
            return;
        boolean adicionou = adicionaCredencial(codigocredencial,nome,viatura);
        if(adicionou){
            AtualizaFicheiros();
            JOptionPane.showMessageDialog(null, "A credencial foi inserida na base de dados!");
            gotoMenu();
        }
        
    }
    private boolean adicionaCredencial(long codigocredencial,String nome,Viatura viatura){
        ArrayList<Credencial> listacredenciais = dados.getListaCredenciais();
        int i=0; 
        if(listacredenciais.size()>0){
            for(i=0;i<listacredenciais.size();i++){
                if(listacredenciais.get(i).getCodigo()==codigocredencial){
                    JOptionPane.showMessageDialog(null,"O Número de Credencial já existe. Por favor, verifique se tem o número correto");
                    return false;
                }             
                if(listacredenciais.get(i).getCodigo()>codigocredencial)
                    break;
            }
        }
        listacredenciais.add(i,new Credencial(codigocredencial,nome,datapartida,datachegada,viatura));
        adicionacredencialviatura(viatura,listacredenciais.get(i));
        dados.setListaCredenciais(listacredenciais);
        return true;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gotoMenu();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int k=JOptionPane.showConfirmDialog(null,"Tem a certeza que deseja inserir a credencial?");
        if(k==JOptionPane.YES_OPTION){
            GuardarAlteracoes();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
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
    private void DataparaViaturas(boolean opcao){
        boolean opcao1=true,opcao2=false;
        if(opcao){
            opcao1=false;
            opcao2=true;
            dialabel.setText(diaCombo.getSelectedItem().toString());
            meslabel.setText(mesCombo.getSelectedItem().toString());
            minutopartidalabel.setText(minutopartidaCombo.getSelectedItem().toString());
            horapartidalabel.setText(horapartidaCombo.getSelectedItem().toString());
            horachegadalabel.setText(horachegadaCombo.getSelectedItem().toString());
            minutochegadalabel.setText(minutochegadaCombo.getSelectedItem().toString());
            anolabel.setText(anoCombo.getSelectedItem().toString());
        }
        diaCombo.setVisible(opcao1);
        dialabel.setVisible(opcao2);
        mesCombo.setVisible(opcao1);
        meslabel.setVisible(opcao2);
        anoCombo.setVisible(opcao1);
        anolabel.setVisible(opcao2);
        horapartidaCombo.setVisible(opcao1);
        minutopartidaCombo.setVisible(opcao1);
        minutopartidalabel.setVisible(opcao2);
        horapartidalabel.setVisible(opcao2);
        horachegadaCombo.setVisible(opcao1);
        horachegadalabel.setVisible(opcao2);
        minutochegadaCombo.setVisible(opcao1);
        minutochegadalabel.setVisible(opcao2);
        jButton5.setVisible(opcao1);
        jButton6.setVisible(opcao2);
        viaturalabel.setVisible(opcao2);
        viaturaCombo.setVisible(opcao2);
        jButton2.setVisible(opcao2);
    }
     private void VerificaViaturasDisponiveis(){
        DataparaViaturas(true);
        atualizaData();
        ArrayList<Viatura> viaturas = dados.getListaViaturas();
        if(viaturas.size()>0){
            disponibilidade = new Color[viaturas.size()];
            String[] viaturasString = new String[viaturas.size()];
            int j=0;
            for(int i=0;i<viaturas.size();i++){
                viaturasString[i] = String.valueOf(viaturas.get(i).getNumero());
                ArrayList<Credencial> credenciais = viaturas.get(i).getListaCredenciais();
                for(j=0;j<credenciais.size();j++){
                    if(credenciais.get(j).getDataPartida().getCodigoDia().equals(datapartida.getCodigoDia())){
                        String novocodigohoraspartida = datapartida.getCodigoHoras();
                        String novocodigohoraschegada = datachegada.getCodigoHoras();
                        String credencialhorapartida = credenciais.get(j).getDataPartida().getCodigoHoras();
                        String credencialhorachegada = credenciais.get(j).getDataChegada().getCodigoHoras();
                        if(((novocodigohoraspartida.compareTo(credencialhorapartida)>=0)&&(novocodigohoraspartida.compareTo(credencialhorachegada)<=0))||((novocodigohoraschegada.compareTo(credencialhorapartida)>=0)&&(novocodigohoraschegada.compareTo(credencialhorachegada)<=0))){
                            disponibilidade[i]=red;
                            break;
                    }
                        else
                            disponibilidade[i]=yellow;
                    }
                }
                if(disponibilidade[i]!=red && disponibilidade[i]!=yellow)
                    disponibilidade[i]= new Color(55,206,85);
            }

            ComboBoxRenderer renderer = new ComboBoxRenderer(viaturaCombo);
            renderer.setStrings(viaturasString);
            renderer.setColors(disponibilidade);
            viaturaCombo.setRenderer(renderer);
        }
        
    }
    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        int TeclaPressionada = evt.getKeyChar();
        if(TeclaPressionada == KeyEvent.VK_ENTER){
            jButton2.doClick();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        int TeclaPressionada = evt.getKeyChar();
        if(TeclaPressionada == KeyEvent.VK_ENTER){
            jButton3.doClick();
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void nomeUtenteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nomeUtenteComboBoxItemStateChanged

    }//GEN-LAST:event_nomeUtenteComboBoxItemStateChanged

    private void nomeUtenteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUtenteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUtenteComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adicionarnovoutente(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        int TeclaPressionada = evt.getKeyChar();
        if(TeclaPressionada == KeyEvent.VK_ENTER){
            jButton1.doClick();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        adicionarnovoutente(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        int TeclaPressionada = evt.getKeyChar();
        if(TeclaPressionada == KeyEvent.VK_ENTER){
            jButton4.doClick();
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        VerificaViaturasDisponiveis();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        int TeclaPressionada = evt.getKeyChar();
        if(TeclaPressionada == KeyEvent.VK_ENTER){
            jButton5.doClick();
        }
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DataparaViaturas(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
        int TeclaPressionada = evt.getKeyChar();
        if(TeclaPressionada == KeyEvent.VK_ENTER){
            jButton6.doClick();
        }
    }//GEN-LAST:event_jButton6KeyPressed

    private void diaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_diaComboItemStateChanged

    }//GEN-LAST:event_diaComboItemStateChanged

    private void horapartidaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_horapartidaComboItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if(!horachanged)
                horachegadaCombo.setSelectedIndex(horapartidaCombo.getSelectedIndex()+3);
        }
    }//GEN-LAST:event_horapartidaComboItemStateChanged

    private void minutopartidaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_minutopartidaComboItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if(!minutochanged)
                minutochegadaCombo.setSelectedIndex(minutopartidaCombo.getSelectedIndex());
        } 
    }//GEN-LAST:event_minutopartidaComboItemStateChanged

    private void horachegadaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_horachegadaComboItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED && !horachanged) {
            horachanged=true;
        }
    }//GEN-LAST:event_horachegadaComboItemStateChanged

    private void minutochegadaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_minutochegadaComboItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED && !minutochanged) {
            minutochanged=true;
        }
    }//GEN-LAST:event_minutochegadaComboItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CredencialInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CredencialInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CredencialInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CredencialInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                JFrame credencialinterface = new CredencialInterface();
                credencialinterface.setVisible(true);
                credencialinterface.pack();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anoCombo;
    private javax.swing.JLabel anolabel;
    private javax.swing.JComboBox<String> diaCombo;
    private javax.swing.JLabel dialabel;
    private javax.swing.JComboBox<String> horachegadaCombo;
    private javax.swing.JLabel horachegadalabel;
    private javax.swing.JComboBox<String> horapartidaCombo;
    private javax.swing.JLabel horapartidalabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mesCombo;
    private javax.swing.JLabel meslabel;
    private javax.swing.JComboBox<String> minutochegadaCombo;
    private javax.swing.JLabel minutochegadalabel;
    private javax.swing.JComboBox<String> minutopartidaCombo;
    private javax.swing.JLabel minutopartidalabel;
    private javax.swing.JComboBox<String> nomeUtenteComboBox;
    private javax.swing.JTextField nomeUtenteTextField;
    private javax.swing.JTextField numerocredencial;
    private javax.swing.JComboBox<String> viaturaCombo;
    private javax.swing.JLabel viaturalabel;
    // End of variables declaration//GEN-END:variables
}