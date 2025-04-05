package exercicios;

public class Exercicio2 {
        private String[] elementos;
        private int capacidade;
        private int tamanho;
        private int inicio;
        private int fim;

        public Exercicio2(int capacidade) {
            this.capacidade = capacidade;
            this.elementos = new String[capacidade];
            this.inicio = 0;
            this.fim = -1;
            this.tamanho = 0;
        }

        //Metodo para enfileirar um elemento (enqueue)
        public void enfileira(String elemento) {
            if (estaCheio()) {
                throw new IllegalStateException("A fila está cheia!");
            }
            fim = (fim + 1) % capacidade;
            elementos[fim] = elemento;
            tamanho++;
        }

        // Metodo para desenfileirar um elemento (dequeue)
        public String desenfileira() {
            if (estaVazia()) {
                throw new IllegalStateException("A fila está vazia!");
            }
            String elementoRemovido = elementos[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            return elementoRemovido;
        }

        public boolean estaVazia() {
            return tamanho == 0;
        }

        public boolean estaCheio() {
            return tamanho == elementos.length;
        }

        // Getter para obter o tamanho atual da fila
        public int getTamanho() {
            return tamanho;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("Fila: [");
            for (int i = 0; i < tamanho; i++) {
                int index = (inicio + i) % capacidade;
                s.append(elementos[index]);
                if (i < tamanho - 1) s.append(", ");
            }
            s.append("]");
            return s.toString();
        }
    }



