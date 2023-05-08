/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author João
 */
import java.util.ArrayList;
import java.util.List;

public class biblioteca {

    public static Iterable<Livros> getLivros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     List<Livros> livros = new ArrayList<>();

    // Adiciona um livro na biblioteca
    public void adicionarLivro(Livros livro) {
        livros.add(livro);
    }

    // Realiza a busca de livros com base nas informações fornecidas pelo usuário
    public List<Livros> buscarLivro(String nome, String autor, String genero, String ano) {
        List<Livros> livrosEncontrados = new ArrayList<>();

        for (Livros livro : livros) {
            // Compara as informações do livro com as informações fornecidas pelo usuário
            if (livro.getNome().equalsIgnoreCase(nome) &&
                livro.getAutor().equalsIgnoreCase(autor) &&
                livro.getGenero().equalsIgnoreCase(genero) &&
                livro.getAno().equalsIgnoreCase(ano)) {

                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }
}

