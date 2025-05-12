package aula01;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Tela extends JFrame{
    
    // Atributos
    private JPanel painel;
    private JLabel jlNome;
    private JLabel jlDataNascimento;
    
    
    public Tela(){
        painel = new JPanel();
        jlNome = new JLabel();
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("Aula 16/04");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(600,500);
        add(painel);
        configurarPainel();
    }
    
    public void configurarPainel(){
        painel.setBackground(Color.BLACK);
        painel.add(jlNome);
    }
}
