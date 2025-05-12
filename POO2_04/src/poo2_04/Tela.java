package poo2_04;

import java.awt.*;
import javax.swing.*;

public class Tela extends JFrame{
  
    // Atributos
    private JPanel painel;
    private JPanel[] regioes;
    private JButton[] jbBotoesNorte;
    private JButton[] jbBotoesCentro;
    private JLabel jlEast;
    private JLabel jlWest;
    private JLabel jlObservacao;
    private JTextArea jtxaObservacao;
    private JScrollPane jspObservacao;
    private JMenuBar barraMenu;
    private JMenu jmSobre;
    private JMenuItem jmiAbout;
    private JMenuItem jmiOpcoes;
    
    
    // Construtor
    public Tela() {
        painel = new JPanel(); 
        // Regioes
        regioes = new JPanel[5];
        for(int i=0; i<5;i++){
            regioes[i] = new JPanel();
        }
        // Botões
        jbBotoesNorte = new JButton[3];
        for(int i = 0; i<3; i++){
            jbBotoesNorte[i] = new JButton("Botão " + (i+1));
        }
        jbBotoesCentro = new JButton[6];
        for(int i = 0; i<6; i++){
            jbBotoesCentro[i] = new JButton("Botão " + (i+1));
        }
        // JLabel
        jlEast = new JLabel("East");
        jlWest = new JLabel("West");
        jlObservacao = new JLabel("Observação: ");
        // JScrollPane
        jtxaObservacao = new JTextArea(20,10);
        jspObservacao = new JScrollPane(jtxaObservacao);
            
        // Menu
        barraMenu = new JMenuBar();
        jmSobre = new JMenu("Sobre");
        jmiAbout = new JMenuItem("About");
        jmiOpcoes = new JMenu("Opções");
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("Aula 07/05");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(200,100);
        add(painel);
        setJMenuBar(barraMenu);
        configurarPainel();
        
    }
    public void configurarPainel()
    {
        // Cria BorderLayout e adiciona as regiões
        painel.setLayout(new BorderLayout());
        painel.add(regioes[0], BorderLayout.NORTH);
        configurarPainelNorth();
        painel.add(regioes[1], BorderLayout.SOUTH);
        configurarPainelSouth();
        painel.add(regioes[2], BorderLayout.EAST);
        configurarPainelEast();
        painel.add(regioes[3], BorderLayout.WEST);
        configurarPainelWest();
        painel.add(regioes[4], BorderLayout.CENTER);
        configurarPainelCenter();
        jmSobre.add(jmiAbout);
        jmSobre.add(jmiOpcoes);
        barraMenu.add(jmSobre);
        
    }
    
    private void configurarPainelNorth(){
        regioes[0].setLayout(new FlowLayout(FlowLayout.RIGHT,10,5));
        regioes[0].setBackground(Color.WHITE);
        
        // Botões
        jbBotoesNorte[0].addActionListener(evento->{
            JOptionPane.showMessageDialog(this, "Clicou no Botão 1");
        });
        jbBotoesNorte[1].addActionListener(evento ->{
            jbBotoesNorte[0].setText("Botão Clicado");
        });
        jbBotoesNorte[2].addActionListener(evento->{
            System.exit(0);
        });
        for( int i = 0; i<3;i++){
            regioes[0].add(jbBotoesNorte[i]);
        }
    }
    private void configurarPainelSouth(){
        regioes[1].setBackground(Color.RED);
        regioes[1].add(jlObservacao);
        regioes[1].add(jspObservacao);
    }
    private void configurarPainelEast(){
        regioes[2].setBackground(Color.ORANGE);
        regioes[2].add(jlEast);
    }
    private void configurarPainelWest(){
        jlWest.setText("Este é o texto que será utilizado no BorderLayout West!");
        regioes[3].add(jlWest);
    }
    private void configurarPainelCenter(){
        regioes[4].setLayout(new GridLayout(3,3));
        regioes[4].setBackground(Color.BLUE);
        // Botões
        for(int i=0;i<6;i++){
            regioes[4].add(jbBotoesCentro[i]);
        }
        jbBotoesCentro[0].addActionListener(evento->{
            JOptionPane.showMessageDialog(this, "Botão do centro clicado");
        });
        jbBotoesCentro[1].addActionListener(evento->{
            String texto = jtxaObservacao.getText();
            JOptionPane.showMessageDialog(this, "Texto do JTextArea do Sul: \n" + texto);
        });
        jbBotoesCentro[2].addActionListener(evento->{
            jlObservacao.setFont(new Font("Courier New", Font.BOLD,20));
        });
        jbBotoesCentro[3].addActionListener(evento->{
            jbBotoesNorte[1].setForeground(Color.red);
        });
        jbBotoesCentro[4].addActionListener(evento->{
            jlEast.setFont(new Font("Arial Black", Font.ITALIC, 20));
        });
        jbBotoesCentro[5].addActionListener(evento->{
            regioes[0].setBackground(Color.GREEN);
        });
    }
}

