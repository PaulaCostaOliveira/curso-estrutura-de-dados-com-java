package com.paula.estruturadados.vetor.exercicios;

import com.paula.estruturadados.vetor.Lista;

public class Ex03 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.remove("A");

        System.out.println(lista);

        lista.remove("E");

        System.out.println(lista);

        lista.remove("C");

        System.out.println(lista);

    }

}
