package poo2_03;

import java.awt.GraphicsEnvironment;

public class POO2_03 {

    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontes = ge.getAvailableFontFamilyNames();

    for (String fonte : fontes) {
        System.out.println(fonte);
    }

        //TelaTextArea tela = new TelaTextArea();
        //tela.configurarJanela();
    }
    
}
