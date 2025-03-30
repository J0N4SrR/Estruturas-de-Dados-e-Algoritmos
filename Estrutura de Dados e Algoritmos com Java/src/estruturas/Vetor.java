package estruturas;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;

    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
           String[] elementosNovo = new String[this.elementos.length * 2];
           for(int i = 0; i < this.tamanho; i++){
               elementosNovo[i] = this.elementos[i];
           } this.elementos = elementosNovo;
        }
    }

    //Primeiro metodo de adicionar elementos - Não é eficiente,  pois vai iterar tds oselementos do vetor ate encontrar uma posição nula.
    //Se elementos forem removidos e houver null no meio, esse metodo pode adicionar elementos de forma desordenada.
        /*for(int i = 0; i < this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = e;
                break;
            }
        }
    }*/
    //Segundo metodo de adicionar elementos -  adiciona diretamente na posição tamanho, sem percorrer o vetor.
    public void add2(String e) throws Exception{
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = e;
            this.tamanho++;
        } else {
            throw new Exception("O Vetor já está cheio");
        }
    }

    // Terceiro metodo de adicionar elementos - Retorna true ou false em vez de lançar exceção.
    public boolean add3(String e){
        aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = e;
            this.tamanho++;
            return true;
        }
        return false;
    }
    // Metodo para adicionar elementos em qualquer posição
    public boolean add3(String elemento, int posicao){
        aumentaCapacidade();
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = this.tamanho -1 ; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = posicao; i < this.tamanho - 1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;

    }

    // Metodo para saber o tamanho do vetor, da pra acessar com o metodo get também
    public int retornaTamanho(){
        return this.tamanho;
    }

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        //algoritimo de busca sequencial
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
        return -1;
    }


    //Personalizando o Metodo toString para me imprimir os vetores
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho; i++) {
            s.append(this.elementos[i]);
            if (i < this.tamanho - 1) s.append(", ");
        }
        s.append("]");
        return s.toString();
    }

    //



}
