package aula01;

// Bibliotecas
import java.awt.Color; //alterar cor
import java.awt.Font; //alterar a fonte

import javax.swing.JButton; // Botoes
import javax.swing.JOptionPane; // Caixa de diálogo
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela01 extends JFrame{
    
    // Atributos
    private JPanel painel; //Painel
    private JLabel jlNomeCompleto; // Texto
    private JLabel jlNome; // Texto
    private JLabel jlDataNascimento; // Texto
    private JTextField jtxNome; // Campo para digitar
    private JButton jbOk; // botão
    
    // Construtor
    public Tela01(){
        painel = new JPanel();
        jlNomeCompleto = new JLabel("Herik Fernandes dos Santos");
        jlDataNascimento = new JLabel("23/01/2001");
        jlNome = new JLabel("Nome: ");
        jtxNome = new JTextField();
        jbOk = new JButton("OK");
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true); // Exibe a janela
        setTitle("Aula 16/04"); // Título da janela
        setSize(600,600); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha ao clicar no X
        setResizable(false); // Não permite redimencionar
        setLocation(600,300); // Posição da janela na tela
        add(painel); // Adiciona o Painel à janela
        configurarPainel(); // Chama o método do painel
    }
    
    public void configurarPainel(){
        painel.setLayout(null); // Layout absoleto
        painel.setBackground(Color.GREEN); // Altera a cor de fundo
        jlNomeCompleto.setFont(new Font("Arial", Font.BOLD,20)); // Altera a fonte e tamanho
        jlNomeCompleto.setForeground(Color.red); // Altera a cor do texto NomeCompleto
        jlNomeCompleto.setBounds(10, 10, 320, 30); // Posição e tamanho do texto
        painel.add(jlNomeCompleto); // Adiciona ao painel
        jlDataNascimento.setBounds(340, 10, 50, 30); // Posição e tamanho de DataNascimento
        painel.add(jlDataNascimento); // Adiciona ao painel
        jlNome.setBounds(10, 50, 50, 30); //
        
        painel.add(jlNome); // Adiciona ao painel
        jtxNome.setBounds(65, 50, 100, 30);
        painel.add(jtxNome);
        
        jbOk.setBounds(50,90, 60, 30); // Posição e tamanho do botão
        painel.add(jbOk); // Adiciona ao painel
        jbOk.addActionListener((e) ->{ //receber ação (no caso o clique do mouse)
            JOptionPane.showMessageDialog(this,"Olá Mundo!");
        });
    }
}
