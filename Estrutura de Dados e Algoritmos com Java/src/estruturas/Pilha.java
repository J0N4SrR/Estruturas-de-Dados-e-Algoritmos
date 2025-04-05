package estruturas;

import java.util.Arrays;

public class Pilha {
    public String[] pilhas;
    public int topo;
    public int tamanho;

    // Construtor
    public Pilha(int capacidade) {
        this.tamanho = capacidade;
        this.pilhas = new String[capacidade];
        this.topo = -1;
    }

    // Metodo para adicionar um elemento na pilha (push)
    public void empilhar(String elemento){
        if(estaCheia()) {
            throw new IllegalStateException("A pilha está Cheia!");
        }
        topo++;
        this.pilhas[this.topo] = elemento;
    }

    //metodo para retirar elemento(pop)
    public String desempilhar(){
        if(estaVazia()) {
            throw new IllegalStateException("A pilha está Vazia!");
        }
        return pilhas[this.topo--];
    }

    //verificar se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    //verificar se a pilha está cheia
    public boolean estaCheia() {
        return topo == tamanho - 1;
    }
    // Metodo para visualizar o elemento no topo da pilha (peek)
    public String valorTopo() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return pilhas[topo];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Pilha: [");
        for(int i = 0; i <= topo; i++){
            s.append(pilhas[i]);
            if (i <= this.topo - 1) s.append(", ");
        }
        s.append("]");
        return s.toString();
    }
}
