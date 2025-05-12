
package poo2_03;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class TelaTextArea extends JFrame{
    
    // Atributos
    private JPanel painel;
    private JTextArea jtxaObservacao; // Caixa para texto
    private JScrollPane jspObservacao; // Scroll de rolagem
    private JButton jbImprimir;
    private JButton jbFormatar;
   
    
    public TelaTextArea(){
        painel = new JPanel(); // Painel
        jtxaObservacao = new JTextArea();
        jspObservacao = new JScrollPane(jtxaObservacao);
        
        // Botões
        jbImprimir = new JButton("Imprimir");
        jbFormatar = new JButton("Formatar");
        
        
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("Aula 30/04");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(900,100);
        add(painel);
        configurarPainel();
    }
    public void configurarPainel(){
        painel.setLayout(null);
        //
        jspObservacao.setBounds(10,10,190,100); // Tamanho da caixa de texto (Scroll é pai)
        
        jspObservacao.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Scroll vertical sempre ativo
        jspObservacao.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // Scroll horizotal nunca aperecer
        jtxaObservacao.setLineWrap(true); // Quebra de linha
        painel.add(jspObservacao);
        
        // Botões
        jbImprimir.setBounds(10,130,90,20);
        jbImprimir.addActionListener(evento ->{
            String texto = jtxaObservacao.getText();
            JOptionPane.showMessageDialog(this, texto);
        });
        painel.add(jbImprimir);
        jbFormatar.setBounds(110,130,90,20);
        jbFormatar.addActionListener(evento ->{
            // Altera a fonte e tamanho
            jtxaObservacao.setFont(new Font("Arial",Font.BOLD,16));
            // Altera a cor do texto
            jtxaObservacao.setForeground(Color.magenta);
        });
        painel.add(jbFormatar);
        
    }
}
