package com.jonas.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private final String[] elementos;
    private int tamanho = 0;

    public Vetor(int tam){

        this.elementos = new String[tam];

    }
    public void mostrar(){
        for (String e : this.elementos) {
            System.out.printf("%s ", e);
        }
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for( int i = 0; i < this.tamanho; i++){
            s.append(this.elementos[i]);
            s.append(",");
        }
        s.append("]");
        return Arrays.toString(elementos);
    }

    /* Opção 01 - Metodo que adiciona elemento no vetor, o metodo percorro o vetor e adiciona um elemento na promeira posição nula, porém esse metodo é muito oneroso, tem complicações em vetore muito longos*/
    public void add(String v){
        for( int i = 0; i < this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = v;
                break;
            }
        }
    }

    /*Opção 02 - */
    public void adicionaElemento(String elemento) throws Exception{
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            tamanho++;
        } else {
            throw new RuntimeException("Vetor já está cheio!!!");
        }
    }

    public int tamanho(){

        return this.tamanho;
    }

    public String busca(int posicao) throws Exception {
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        return this.elementos[posicao];

    }
}
