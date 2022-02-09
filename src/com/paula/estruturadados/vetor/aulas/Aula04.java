package com.paula.estruturadados.vetor.aulas;

import com.paula.estruturadados.vetor.Vetor;

public class Aula04 {

    public static void main(String[] args){

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        //Imprime a quantidade de elementos existentes no vetor
        System.out.println(vetor.tamanho());
        //Imprime os elementos do vetor
        System.out.println(vetor.toString());
    }

}
