package exercicios;

public class Exercicio1 {
    public int[] pilhas;
    public int topo;
    public int tamanho;

    // Construtor
    public Exercicio1(int capacidade) {
        this.tamanho = capacidade;
        this.pilhas = new int[capacidade];
        this.topo = -1;
    }

    // Metodo para adicionar um elemento na pilha (push)
    public void empilhar(int elemento){
        if(estaCheia()) {
            System.out.println("-1");
        }
        topo++;
        this.pilhas[this.topo] = elemento;
    }

    //metodo para retirar elemento(pop)
    public void desempilhar(){
        if(estaVazia()) {
            System.out.println("-1 => Não há itens para lavar");

        }
        this.topo--;
    }

    //verificar se a pilha está vazia
    public boolean estaVazia() {
        return topo == 0;
    }

    //verificar se a pilha está cheia
    public boolean estaCheia() {
        return topo == tamanho - 1;
    }
    // Metodo para visualizar o elemento no topo da pilha (peek)
    public int valorTopo() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return pilhas[topo];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Itens: [");
        for(int i = 0; i <= topo; i++){
            s.append(pilhas[i]);
            if (i <= this.topo - 1) s.append(", ");
        }
        s.append("]");
        return s.toString();
    }
}