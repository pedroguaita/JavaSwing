/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.modelo;

import java.time.LocalDate;

/**
 *
 * @author pedro
 */
public class Aluno {
    
    private String nome; 
    private LocalDate dataNascimento; 
    private char sexo; 
    private int matricula; 
    private String curso; 
    private String CPF; 
    private String rua; 
    private int numero; 
    private String bairro; 
    private String cidade; 
    private String CEP; 
    private String estado;
    
    public Aluno(){
        
    }
    
    public Aluno(String nome, LocalDate dataNascimento, char sexo, int matricula, String curso, String CPF, String rua, int numero, String bairro, String cidade, String CEP, String estado){
        this.nome = nome; 
        this.dataNascimento = dataNascimento; 
        this.sexo = sexo; 
        this.matricula = matricula; 
        this.curso = curso; 
        this.CPF = CPF; 
        this.rua = rua; 
        this.numero = numero; 
        this.bairro = bairro; 
        this.cidade = cidade; 
        this.CEP = CEP; 
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return  
           "Aluno{" +
           "Nome = " + nome + '\'' +
           ", dataNascimento = " + dataNascimento +
           ", sexo = " + sexo +
           ", matricula = " + matricula +
           ", curso = '" + curso + '\'' +
           ", CPF = '" + CPF + '\'' +
           ", Endereço = " + rua + ", " + numero + ", " + bairro + ", " + cidade + " - " + estado + " (" + CEP + ")" +
           '}';
    }
}
