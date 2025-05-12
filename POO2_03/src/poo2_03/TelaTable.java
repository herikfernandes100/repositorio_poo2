package poo2_03;
import javax.swing.*;

public class TelaTable extends JFrame{
    
 // Atributos
    private JPanel painel;
    private JTable jtProduto;
    private JScrollPane jspProduto;
    

   
    
    public TelaTable(){
        painel = new JPanel(); // Painel
        jtProduto = new JTable(new String[][]{{"1","1","1"},{"2","2","2"}},new String[]{"Descrição","Preço","Estoque"});
    }
    
    // Métodos públicos
    public void configurarJanela(){
        setVisible(true);
        setTitle("Aula 30/04");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(400,100);
        add(painel);
        configurarPainel();
    }
    public void configurarPainel(){
        painel.setLayout(null);
        
    }
}
