/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Escola {
     public static void main(String[] args) {
   
        //Abstração, trazendo pro código o que é útil/real
        aluno alunoA = new aluno(); //Construtores
        aluno alunoB = new aluno();
        
        alunoA.curso = "Desenvolvimento de Sistemas";
        alunoB.curso = "Admnistração";
        
        System.out.println("O curso do aluno A é: "+alunoA.curso);
        System.out.println("O curso do aluno B é: "+alunoB.curso);
        System.out.println("A escola do aluno A fica na: "+aluno.local);
        System.out.println("A escola do aluno B fica na: "+aluno.local);
}
}