package com.paula.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    //Atributos
    private String[] elementos; //Criando um vetor de elementos
    private int tamanho; //Atributo tamanho controla o tamanho real do vetor

    //Criando um contrutor de vetor, que recebera a capacidade de elementos
    public Vetor(int capacidade) {

        this.elementos = new String[capacidade];
        this.tamanho = 0; //Inicializa o vetor com tamanho igual a 0
    }

/*********************OPÇAO 1 :Criando um novo metodo para adicionar elementos ao vetor********************************/

      /*  public void adiciona(String elemento){
        for (int i=0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){         // se this.elementos na posiçao i for igual a nulo, o elemento pode ser atribuido a essa posiçao do vetor
                this.elementos[i] = elemento;     //posiçao i recebe o parametro elemento
                break;                           //interrope o loop na primeira posiçao nula encontrada
            }
        }

     */

/*********************OPÇAO 2 :Criando um novo metodo para adicionar elementos ao vetor********************************/

   /* public void adiciona(String elemento) throws Exception {
        //Verificando se o tamanho é menor que a capacidade do vetor de elementos
        if (this.tamanho < this.elementos.length) {
           //Se o tamanho for menor que a capacidade do vetor de elementos, adiciono mais elementos no vetor
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }*/

    /*********************OPÇAO 3 :Criando um novo metodo para adicionar elementos ao vetor********************************/

    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }


    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    //
    public boolean adiciona(int posicao, String elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //mover todos os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
//AULA 05
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida! Posiçao maior que o tamanho real do vetor");
        }
        return this.elementos[posicao];
    }
//AULA 06
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i; //retorna a posiçao do elemento em que o elemento foi encontrado. retorno -1 a posicao nao existe
            }
        }
        return -1;
    }

    // B D E F F -> posição a ser removida é 1 (G)
    // 0 1 2 3 4 -> tamanho é 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}