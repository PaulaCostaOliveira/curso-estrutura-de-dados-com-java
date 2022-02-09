//EXERCICIO 01: Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf da classe ArrayList
package com.paula.estruturadados.vetor.exercicios;

import com.paula.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Ex02 {

    public static void main(String[] args) {
 //Metodo Posiçao
        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A")); //Posição 2

            Lista<String> lista = new Lista<String>(5);
            lista.adiciona("A");
            lista.adiciona("B");
            lista.adiciona("A");

            System.out.println(lista.ultimoIndice("A"));
        }
    }

