package poo2_04;
/*
Gerenciador de Layout

Border Layout:
define regioes

*/

import java.awt.*;
import javax.swing.*;

public class TelaBorderLayout extends JFrame{
  
    // Atributos
    private JPanel painel;
    private JButton[] jbBotoes;
    
    // Construtor
    public TelaBorderLayout() {
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
        /*
        painel.add() -> (ITEM, BorderLayout.REGIAO)
        REGIAO -> NORTH, SOUTH, WEST, EAST, CENTER
        */
             
        painel.setLayout(new BorderLayout());
        painel.add(jbBotoes[0],BorderLayout.NORTH);
        painel.add(jbBotoes[1],BorderLayout.SOUTH);
        painel.add(jbBotoes[2],BorderLayout.WEST);
        painel.add(jbBotoes[3],BorderLayout.EAST);
        painel.add(jbBotoes[4],BorderLayout.CENTER);
    }
}

