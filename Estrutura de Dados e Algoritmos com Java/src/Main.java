import estruturas.Vetor;

public class Main {
    public static void main(String[] args) throws Exception {

        Vetor v2 = new Vetor(3);
        Vetor v3 = new Vetor(4);

        v2.add2("a");
        v2.add2("b");
        v2.add2("c");

        System.out.println("Vetor V2: " + v2);

        v3.add2("A");
        v3.add2("B");
        v3.add2("C");

        v3.add3("X", 1);
        System.out.println("Vetor inicial: " + v3);
        System.out.println("Após inserir X na posição 1: " + v3);

        v3.remove(2);
        System.out.println("Após remover o elemento na posição 2: " + v3);

        System.out.println("Busca pelo elemento 'X': " + v3.busca("X"));
        System.out.println("Tamanho atual: " + v3.retornaTamanho());




    }
}
