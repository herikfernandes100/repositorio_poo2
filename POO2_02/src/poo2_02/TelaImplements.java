package poo2_02;

// Bibliotecas
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TelaImplements extends JFrame implements ActionListener{
    
    // Atributos
    private JPanel painel;
    private JButton jbTeste;
    
    // Construtor
    public TelaImplements(){
        painel = new JPanel();
        jbTeste = new JButton("Teste");
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("POO_02"); // Nome da janela
        setSize(600,600); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar no "X"
        setResizable(false); // Bloqueia redimencionar
        setLocation(400,200); // Localização da janela
        add(painel); // Adiciona o painel
        configurarPainel();
    }
    public void configurarPainel(){
        painel.setLayout(null);
        jbTeste.setBounds(240, 10, 100, 30); // Localização e tamanho do botão
        jbTeste.addActionListener(this); // Permite o botão gerar um evento
        painel.add(jbTeste); // Adiciona o botão ao painel
        
    }

    // Método para comparar os eventos
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == jbTeste){ // Compara se o botão recebeu o evento
            JOptionPane.showMessageDialog(this, "Esse botão foi clicado");
        }
            
    }
}
