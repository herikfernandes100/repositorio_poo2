/*
Discente: Herik Fernandes dos Santos
Matrícula: 16-97128
Curso: Eng. Computação 5°P - Noturno
*/
package lista_02;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class TelaLista2 extends JFrame{
    // Atributos
    private JPanel painel;
    private JLabel jlFonte;
    private JLabel jlTamanho;
    private JLabel jlCor;
    private JComboBox jcbFonte;
    private JComboBox jcbTamanho;
    private JComboBox jcbCor;
    private JButton jbAlterarFormatacao;
    private JButton jbLimparFormatacao;
    private JButton jbApagarTexto;
    private JRadioButton jrbNegrito;
    private JRadioButton jrbNormal;
    private JRadioButton jrbItalico;
    private JRadioButton jrbNegritoItalico;
    private ButtonGroup bgEstilo;
    private JTextArea jtxaTexto;
    private JScrollPane jspTexto;
    
  
    public TelaLista2(){
        painel = new JPanel();
        
        // JLabel
        jlFonte = new JLabel("Fonte: ");
        jlTamanho = new JLabel("Tamanho: ");
        jlCor = new JLabel("Cor: ");
        
        //JComboBox
        jcbFonte = new JComboBox(new String[]{"-Selecione-","Arial","Calibri","Cambria","Comic Sans MS","Consolas","Dialog","Georgia","Lucida Console","Times New Roman","Verdana"});
        jcbTamanho = new JComboBox();
        jcbTamanho.addItem("-Selecione-");
        for(int i = 8; i<=17; i++){ // Adiciona de 8 a 17 no JComboBox
            jcbTamanho.addItem(i);
        }
        jcbCor = new JComboBox(new String[]{"-Selecione-","Amarelo","Azul","Branco","Ciano","Cinza","Laranja","Magenta","Preto","Verde","Vermelho"});
        
        // JButton
        jbAlterarFormatacao = new JButton("Alterar formatação");
        jbLimparFormatacao = new JButton("Limpar formatação");
        jbApagarTexto = new JButton("Apagar texto");
        
        // JRadioButton e ButtonGroup
        jrbNegrito = new JRadioButton("Negrito");
        jrbItalico = new JRadioButton("Itálico");
        jrbNormal = new JRadioButton("Normal");
        jrbNegritoItalico = new JRadioButton("Negrito - Itálico");
        bgEstilo = new ButtonGroup();
        
        // JTextArea e ScrollPane
        jtxaTexto = new JTextArea();
        jspTexto = new JScrollPane(jtxaTexto);
    }
    
    public void configurarJanela(){
        setVisible(true);
        setTitle("Lista 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setResizable(false);
        setLocation(200,200);
        add(painel);
        configurarPainel();
    }
    public void configurarPainel(){
        painel.setLayout(null);
        
        // JLabel
        jlFonte.setBounds(10,10,40,20);
        painel.add(jlFonte);
        jlTamanho.setBounds(250,10,100,20);
        painel.add(jlTamanho);
        jlCor.setBounds(10,40,50,20);
        painel.add(jlCor);
        
        // ComboBox
        jcbFonte.setBounds(60,10,150,20);
        painel.add(jcbFonte);
        jcbTamanho.setBounds(320,10,100,20);
        painel.add(jcbTamanho);
        jcbCor.setBounds(45,40,100,20);
        painel.add(jcbCor);
        
        // JButton
        jbAlterarFormatacao.setBounds(155,40,200,20);
        jbAlterarFormatacao.addActionListener(evento ->{
            // Recebe fonte do JComboBox
            String fonte = jcbFonte.getSelectedItem().toString();
            if(fonte.equals("-Selecione-")){
                JOptionPane.showMessageDialog(this, "Selecione uma fonte!");
            }
            // Recebe tamanho do JComboBox
            String tamanhoString = jcbTamanho.getSelectedItem().toString();
            int tamanho =0;
            if(tamanhoString.equals("-Selecione-")){
                JOptionPane.showMessageDialog(this, "Selecione um tamanho!");
            }else{
                tamanho = Integer.parseInt(jcbTamanho.getSelectedItem().toString());
            }
            // Recebe cor do JComboBox
            String corString = jcbCor.getSelectedItem().toString();
            Color cor = Color.BLACK;
            if(corString.equals("-Selecione-")){
                JOptionPane.showMessageDialog(this, "Selecione uma cor!");
            }else {
                cor = receberCor(jcbCor.getSelectedItem().toString());
            }
            // Recebe estilo do JRadioButton
            int estilo = receberEstilo();
            // Alterar formatação
            jtxaTexto.setFont(new Font(fonte, estilo, tamanho));
            jtxaTexto.setForeground(cor);
        });
        painel.add(jbAlterarFormatacao);
        jbLimparFormatacao.setBounds(365,40,200,20);
        jbLimparFormatacao.addActionListener(evento->{ // Reseta o padrão
            jtxaTexto.setFont(new Font("Arial",Font.PLAIN,12)); // Fonte padrão
            jtxaTexto.setForeground(Color.BLACK); // Cor padrão
            jcbFonte.setSelectedIndex(0); // Volta para "-Selecione-"
            jcbTamanho.setSelectedIndex(0); // Volta para "-Selecione-"
            jcbCor.setSelectedIndex(0); // Volta para "-Selecione-"
            bgEstilo.clearSelection(); // Volta para "-Selecione-"
        });
        painel.add(jbLimparFormatacao);
        jbApagarTexto.setBounds(445,70,120,20);
        jbApagarTexto.addActionListener(evento ->{ // Apaga o texto do JTextArea
            jtxaTexto.setText("");
        });
        painel.add(jbApagarTexto);
        
        // ButtonGroup
        bgEstilo.add(jrbNegrito);
        bgEstilo.add(jrbItalico);
        bgEstilo.add(jrbNormal);
        bgEstilo.add(jrbNegritoItalico);
        
        // JRadioButton
        jrbNegrito.setBounds(10,70,80,20);
        painel.add(jrbNegrito);
        jrbNormal.setBounds(100,70,80,20);
        painel.add(jrbNormal);
        jrbItalico.setBounds(180,70,80,20);
        painel.add(jrbItalico);
        jrbNegritoItalico.setBounds(260,70,120,20);
        painel.add(jrbNegritoItalico);
        
        // JScrollPane
        jspTexto.setBounds(10,100,555,450);
        jtxaTexto.setLineWrap(true); // Quebra de linha
        painel.add(jspTexto);
    }
    private Color receberCor(String corString){ // Método para converter String em Color
        Color cor;
        switch (corString) {
            case "Amarelo" :
                cor = Color.YELLOW;
                break;
            case "Azul" :
                cor = Color.BLUE;
                break;
            case "Branco":
                cor = Color.WHITE;
                break;
            case "Ciano":
                cor = Color.CYAN;
                break;
            case "Cinza":
                cor = Color.GRAY;
                break;
            case "Laranja":
                cor = Color.ORANGE;
                break;
            case "Vermelho":
                cor = Color.RED;
                break;
            case "Verde":
                cor = Color.GREEN;
                break;
            default:
                cor = Color.BLACK;
                JOptionPane.showMessageDialog(this, "Selecione um estilo!");
        }
        return cor;
    }
    private int receberEstilo (){ // Método para receber estilo do JRadioButton
        int estilo = Font.PLAIN;
        if(jrbNegrito.isSelected()){
                estilo = Font.BOLD;
            }else if(jrbNormal.isSelected()){
                estilo = Font.PLAIN;
            }else if(jrbItalico.isSelected()){
                estilo = Font.ITALIC;
            }else if(jrbNegritoItalico.isSelected()){
                estilo = Font.BOLD |Font.ITALIC;
            }
        return estilo;
    }
}
