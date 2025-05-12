package poo2_03;

import javax.swing.*;

public class TelaComboBox extends JFrame{
    
    // Atributos
    private JPanel painel;
    private JComboBox jcbEstados;
    private JLabel jlEstados;
    private JButton jbAdicionar;
    private JButton jbImprimir;
    
    public TelaComboBox(){
        painel = new JPanel(); // Painel
        
        // Combo Box
        jcbEstados = new JComboBox(new String[]{"Acre", 
            "Minas Gerais", "São Paulo", "Rio de Janeiro"});
        jlEstados = new JLabel("Selecione o seu estado: ");
        
        // Botões
        jbAdicionar = new JButton("Adicionar");
        jbImprimir = new JButton("Imprimir");
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("Aula 30/04");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(400,100);
        add(painel);
        configurarPainel();
    }
    public void configurarPainel(){
        painel.setLayout(null);
        //painel.setBackground(Color.red);
        
        // Estados
        jlEstados.setBounds(10,10,150,20);
        painel.add(jlEstados);
        jcbEstados.setBounds(165,10,100,20);
        painel.add(jcbEstados);
        
        // Botões
        jbAdicionar.setBounds(20,50,100,20); 
        jbAdicionar.addActionListener(evento ->{ 
            // Recebe um estado do usuario
            String estado = JOptionPane.showInputDialog(this, "Digite um estado: ");
            // Adiciona estado em jbcEstados
            jcbEstados.addItem(estado);
        });
        painel.add(jbAdicionar);
        jbImprimir.setBounds(130,50,100,20);
        jbImprimir.addActionListener(evento ->{
            
            // Recebe o item do ComboBox selecionado "Object" e converte em "String"
            String estado = jcbEstados.getSelectedItem().toString();
            // Recebe o índice do ComboBox
            int indice = jcbEstados.getSelectedIndex();
            
            JOptionPane.showMessageDialog(this, "O indice selecionado: " + indice 
                    + "\nCorresponde ao estado: "+ estado);
        });
        painel.add(jbImprimir);
        
    }
}
