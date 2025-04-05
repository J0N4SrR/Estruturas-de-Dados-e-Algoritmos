import estruturas.Fila;
import estruturas.Pilha;

public class TestePilhaFila {

    public static void main(String[] args) {
        Pilha pilha1 = new Pilha(5);
        Pilha pilha2 = new Pilha(3);

        pilha1.empilhar("10");
        pilha1.empilhar("Batata");
        pilha1.empilhar("Amém");
        System.out.println(pilha1);
        System.out.println(pilha1.valorTopo());
        pilha2.empilhar("Gol");
        pilha2.empilhar("15");
        System.out.println(pilha1.valorTopo());
        System.out.println(pilha2.valorTopo());
        System.out.println(pilha2);
        pilha1.desempilhar();
        pilha2.desempilhar();
        System.out.println(pilha1);
        System.out.println(pilha2);
        System.out.println(pilha1.valorTopo());
        System.out.println(pilha2.valorTopo());
        System.out.println("-----------------------Fila----------------------------");
        Fila fila = new Fila(5);

        fila.enfileira("A");
        fila.enfileira("B");
        fila.enfileira("C");
        fila.enfileira("D");

        System.out.println(fila);

        System.out.println("Removendo: " + fila.desenfileira());
        System.out.println("Removendo: " + fila.desenfileira());

        System.out.println(fila);

        fila.enfileira("E");
        fila.enfileira("F");

        System.out.println(fila);


    }

}
