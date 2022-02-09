//EXERCICIO 01: Melhore a classe Lista e implemente o método contém, semelhante ao método contains da classe ArrayList
package com.paula.estruturadados.vetor.exercicios;

import com.paula.estruturadados.vetor.Lista;

public class Ex01 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);//Utilizando a classe Lista, cria uma Lista com capacidade para 5 elementos

        //Adiciona elementos a lista
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A")); //true
        System.out.println(lista.contem("B")); //true
        System.out.println(lista.contem("E")); //false (elemento E não existe neste Vetor)
    }
}
