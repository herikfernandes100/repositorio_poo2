package poo2_04;
/*
Gerenciador de Layout

Flow Layout:
Centralizado, esquerda ou direita
itens adicionados sempre a direita


*/

import java.awt.FlowLayout;
import javax.swing.*;

public class TelaFlowLayout extends JFrame{
  
    // Atributos
    private JPanel painel;
    private JButton[] jbBotoes;
    
    // Construtor
    public TelaFlowLayout(){
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
        // FlowLayout() -> (FlowLayout.REGIAO, ESPAÇAMENTO_HORIZONTAL, ESPAÇAMENTO_VERTICAL)
        // REGIAO ->    CENTER,LEADING,LEFT,RIGHT,TRAILING.
        painel.setLayout(new FlowLayout (FlowLayout.RIGHT,20,20));
        for(int i=0; i<5; i++){
            painel.add(jbBotoes[i]);
        }
    }
}
