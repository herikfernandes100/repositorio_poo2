package poo2_02;

// Bibliotecas
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TelaIdade extends JFrame{
    
    // Atributos
    private JPanel painel; // Painel
    private JButton jbFechar; // Botão Fechar
    private JButton jbCalcular; // Botão Calcular
    private JLabel jlAnoNascimento; // Texto AnoNascimento
    private JTextField jtxAnoNascimento; // Caixa de texto
    
    // Construtor
    public TelaIdade(){
        painel = new JPanel();
        jbFechar = new JButton("Fechar");
        jbCalcular = new JButton("Calcular");
        jlAnoNascimento = new JLabel("Ano de Nascimento :");
        jtxAnoNascimento = new JTextField();
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("POO_02"); // Nome da janela
        setSize(600,600); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar no "X"
        setResizable(false); // Bloqueia redimencionar
        setLocation(400,100); // Localização da janela
        add(painel); // Adiciona o painel
        configurarPainel();
    }
    public void configurarPainel(){
        painel.setLayout(null);
        
        // Texto Ano de Nascimento
        jlAnoNascimento.setBounds(10, 10, 130, 20); // Localização e tamanho do texto
        painel.add(jlAnoNascimento);
        
        // Caixa de texto Ano de Nascimento
        jtxAnoNascimento.setBounds(145, 10, 90, 20);
        painel.add(jtxAnoNascimento);
        
        // Botão calcular
        jbCalcular.setBounds(30, 30, 100, 20);
        // Permite o botao gerar eventos
        jbCalcular.addActionListener(evento ->{
            String retorno = jtxAnoNascimento.getText(); // retorno da caixa de texto
            int ano = Integer.parseInt(retorno);
            int idade = 2025 - ano;
            JOptionPane.showMessageDialog(this, "A idade é: " + idade);
        });
        painel.add(jbCalcular);
        
        // Botão Fechar
        jbFechar.setBounds(135, 30, 100, 20); // Localização e tamanho do botão
        painel.add(jbFechar);
        // Permite o botão fechar gerar eventos
        jbFechar.addActionListener(evento ->{
            JOptionPane.showMessageDialog(this, "Sistema será finalizado");
            System.exit(0); // Fecha a janela
        }); 

    }

}
