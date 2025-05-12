package poo2_04;
/*
Gerenciador de Layout

Grid Layout:
divide o painel em grades

*/

import java.awt.*;
import javax.swing.*;

public class TelaGridLayout extends JFrame{
  
    // Atributos
    private JPanel painel;
    private JButton[] jbBotoes;
    
    // Construtor
    public TelaGridLayout(){
        painel = new JPanel(); // Painel
        jbBotoes = new JButton[5];
        for(int i=0; i<5; i++){
            jbBotoes[i] = new JButton("Botão "+(i+1));
        }
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("Aula 07/05");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(400,100);
        add(painel);
        configurarPainel();
    }
    public void configurarPainel(){
        // GridLayout() -> (LINHAS, COLUNAS, ESPAÇAMENTO_HORIZONTAL, ESPAÇAMENTO_VERTICAL)
             
        painel.setLayout(new GridLayout(3,2,50,15));
        for(int i=0; i<5; i++){
            painel.add(jbBotoes[i]);
        }
    }
}

