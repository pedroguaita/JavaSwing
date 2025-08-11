/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationaula1;

import java.util.Scanner;
import javaapplicationaula1.ex002.Livro;

/**
 *
 * @author 2830482411036
 */
public class PrincipalLivro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Livro livro1 = new Livro();
        
        System.out.println("Insira o titulo do livro: ");
        livro1.titulo = sc.nextLine();
        
        System.out.println("Insira o autor do livro: ");
        livro1.autor = sc.nextLine();
        
        System.out.println("Insira o ano de pubicação do livro: ");
        livro1.ano = sc.nextInt();
        
        System.out.println("Informações inseridas:");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano de publicaçãp: " + livro1.ano);
    }
}
