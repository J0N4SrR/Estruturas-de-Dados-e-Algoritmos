import estruturas.VetorObject;

public class TesteVetorObject {
    public static void main(String[] args) throws Exception {

        VetorObject v3 = new VetorObject(4);

        v3.adiciona("A");
        v3.adiciona("B");
        v3.adiciona("C");

        System.out.println("Vetor inicial: " + v3);
        v3.adiciona("X", 1);
        System.out.println("Após inserir X na posição 1: " + v3);

        v3.remove(2);
        System.out.println("Após remover o elemento na posição 2: " + v3);

        System.out.println("Busca pelo elemento 'X': " + v3.busca("X"));
        System.out.println("Tamanho atual: " + v3.retornaTamanho());




    }
}
