package com.paula.estruturadados.vetor;

public class Vetor {
    //Atributos
    private String[] elementos; //Criando um vetor de elementos
    private int tamanho; //Atributo tamanho controla o tamanho real do vetor

    //Criando um contrutor de vetor, que recebera a capacidade de elementos
    public Vetor(int capacidade) {

        this.elementos = new String[capacidade];
        this.tamanho = 0; //Inicializa o vetor com tamanho igual a 0
    }
/**********************************************************************************************************************/
/*********************OPÇAO 1 :Criando um novo metodo para adicionar elementos ao vetor********************************/

      /*  public void adiciona(String elemento){
        for (int i=0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){         // se this.elementos na posiçao i for igual a nulo, o elemento pode ser atribuido a essa posiçao do vetor
                this.elementos[i] = elemento;     //posiçao i recebe o parametro elemento
                break;                           //interrope o loop na primeira posiçao nula encontrada
            }
        }

     */
/*****************************************************************************************************************/
/*********************OPÇAO 2 :Criando um novo metodo para adicionar elementos ao vetor********************************/

    public void adiciona(String elemento) throws Exception {
        //Verificando se o tamanho é menor que a capacidade do vetor de elementos
        if (this.tamanho < this.elementos.length) {
           //Se o tamanho for menor que a capacidade do vetor de elementos, adiciono mais elementos no vetor
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor ja está cheio, não é possível adicionar mais elementos.");
        }
    }
/*****************************************************************************************************************/
/*********************OPÇAO 3 :Criando um novo metodo para adicionar elementos ao vetor********************************/
/*
    public boolean adiciona(String elemento) {
        //Verificando se o tamanho é menor que a capacidade do vetor de elementos
        if (this.tamanho < this.elementos.length) {
            //Se o tamanho for menor que a capacidade do vetor de elementos, adiciono mais elementos no vetor
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }*/
}
