package com.paula.estruturadados.vetor.teste;

import com.paula.estruturadados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args){

        Vetor vetor = new Vetor(10); /*vetor com 2 elementos*/
/***************************************************************************************************************/
/*********************OPcAO 2 :Criando um novo metodo para adicionar elementos ao vetor********************************/
    try {
        vetor.adiciona("Curso");
        vetor.adiciona("Estrutura de Dados");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
