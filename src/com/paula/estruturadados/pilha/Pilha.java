package com.paula.estruturadados.pilha;

import com.paula.estruturadados.base.EstruturaEstatica;
//Criando classe a Pilha derivada da superclasse Estrutura Estatica. Cria utilizando a palavra extends, seguida do nome da superclasse
public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){

        if (this.estaVazia()){
            return null;
        }

        return this.elementos[tamanho-1];
    }

    public T desempilha(){

        if (this.estaVazia()){
            return null;
        }

		return this.elementos[--tamanho];
    }
}
