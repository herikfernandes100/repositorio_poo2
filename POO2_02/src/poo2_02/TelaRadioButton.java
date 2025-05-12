package poo2_02;

// Bibliotecas
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TelaRadioButton extends JFrame{
    
    // Atributos
    private JPanel painel; // Painel
    private JRadioButton jrbFem;
    private JRadioButton jrbMasc;
    private JRadioButton jrbNaoB;
    private JCheckBox jckHeavy;
    private JCheckBox jckPop;
    private JCheckBox jckRock;
    private JCheckBox jckReage;
    private JLabel jlSexo;
    private JLabel jlEstilo;
    private ButtonGroup bgSexo;
    private JButton jbImprimir;
    
    
    // Construtor
    public TelaRadioButton(){
        painel = new JPanel();
        jrbFem = new JRadioButton("Feminino");
        jrbMasc = new JRadioButton("Masculino");
        jrbNaoB = new JRadioButton("Não Binário");
        jckHeavy = new JCheckBox("Heavy Metal");
        jckPop = new JCheckBox("Pop");
        jckRock = new JCheckBox("Rock");
        jckReage = new JCheckBox("Reage");
        jlSexo = new JLabel("Sexo :");
        jlEstilo = new JLabel("Estilo Musical Preferido: ");
        bgSexo = new ButtonGroup();
        jbImprimir = new JButton("Imprimir");
    }
    
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("POO_02"); // Nome da janela
        setSize(600,600); // Tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar no "X"
        //setResizable(false); // Bloqueia redimencionar
        setLocation(400,100); // Localização da janela
        add(painel); // Adiciona o painel
        configurarPainel();
    }
    public void configurarPainel(){
        //painel.setLayout(null);
        bgSexo.add(jrbFem);
        bgSexo.add(jrbMasc);
        bgSexo.add(jrbNaoB);
        painel.add(jlSexo);
        painel.add(jrbFem);
        painel.add(jrbMasc);
        painel.add(jrbNaoB);
        
        painel.add(jlEstilo);
        painel.add(jckHeavy);
        painel.add(jckPop);
        painel.add(jckRock);
        painel.add(jckReage);
        
        jbImprimir.addActionListener(evento -> {
            String retorno = "Sexo: ";
            if(jrbFem.isSelected()){
                retorno += "Feminino\n";
            }else if (jrbMasc.isSelected()) {
                retorno += "Masculino\n";
            } else if(jrbNaoB.isSelected()){
                retorno += "Não Binário\n";
            }
            
            retorno += "Estilo Musical Escolhido: \n";
            if(jckHeavy.isSelected()){
                retorno += "Heavy Metal\n";
            }if(jckPop.isSelected()){
                retorno += "Pop\n";
            }if (jckRock.isSelected()) {
                retorno += "Rock\n";
            }if(jckReage.isSelected()){
                retorno += "Reage\n";
            }
            JOptionPane.showMessageDialog(this,retorno, 
                    "Retorno Sistema",JOptionPane.PLAIN_MESSAGE);
        });
        painel.add(jbImprimir);
        

    }

}
