/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastroaluno1;

/**
 * Classe criada para...
 * @author Pedro Pereira Guaita
 * @since Classe criada em 08/09/2025
 */
public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    
    public Aluno(){  
    }
    
    public Aluno(String nome, int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    
    public Object[] obterDados(){
        return new Object[]{nome, idade, curso};
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}//fim da classe
