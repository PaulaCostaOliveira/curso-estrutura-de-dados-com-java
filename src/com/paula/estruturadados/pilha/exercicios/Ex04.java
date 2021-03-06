package com.paula.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Ex04 {

    public static void main(String[] args) {

        Stack<Livro> pilha = new Stack<Livro>();

        Livro livro1 = new Livro();
        livro1.setNome("Livro 1");
        livro1.setAutor("Autor 1");
        livro1.setAnoLancamento(2001);
        livro1.setIsbn("B01C2XX8Y2");

        Livro livro2 = new Livro();
        livro2.setNome("Livro 2");
        livro2.setAutor("Autor 2");
        livro2.setAnoLancamento(2002);
        livro2.setIsbn("B00OYTCT02");

        Livro livro3 = new Livro();
        livro3.setNome("Livro 3");
        livro3.setAutor("Autor 3");
        livro3.setAnoLancamento(2003);
        livro3.setIsbn("B00U01QQWU");

        Livro livro4 = new Livro();
        livro4.setNome("Livro 4");
        livro4.setAutor("Autor 4");
        livro4.setAnoLancamento(2004);
        livro4.setIsbn("B00YHBVHGO");

        System.out.println("Pilha de livros criada, pilha está vazia? "+ pilha.isEmpty());

        System.out.println("Empilhando livros na pilha:");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size() + " livros foram empilhados:");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? "+ pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilha:");

        while (!pilha.isEmpty()){
            System.out.println("Desempilhando livro: " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhandos, pilha vazia: " + pilha.isEmpty());
    }

}
