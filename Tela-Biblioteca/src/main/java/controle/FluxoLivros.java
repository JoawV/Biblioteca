/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import dados.Livros;
import java.util.ArrayList;

/**
 *
 * @author João
 */
public class FluxoLivros {
    private ArrayList<Livros> livros = new ArrayList();
    
    public boolean salvar (Livros  l) {
        if (l != null) {
            livros.add(l);
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Livros> retornar() {
        return livros;
    }
}
