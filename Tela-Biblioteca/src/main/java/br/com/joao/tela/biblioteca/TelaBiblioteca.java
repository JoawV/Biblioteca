/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.joao.tela.biblioteca;

import com.formdev.flatlaf.FlatDarculaLaf;

/**
 *
 * @author João
 */
public class TelaBiblioteca {

    public static void main(String args[]) {
        try {
    javax.swing.UIManager.setLookAndFeel(new FlatDarculaLaf());
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex

    
        ) {
    java.util.logging.Logger.getLogger(ConversorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
}
