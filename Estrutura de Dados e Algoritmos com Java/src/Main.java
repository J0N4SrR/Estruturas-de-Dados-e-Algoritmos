import com.jonas.estruturadados.vetor.Vetor;

public class Main {
    public static void main(String[] args) throws Exception {
        Vetor v1 = new Vetor(5);
        Vetor v2 = new Vetor(4);
        v1.add("Primeiro");
        v1.add("Segundo");
        v1.add("Terceiro");
        v1.add("Quarto");
        v1.add("Quinto");
        v1.add("Sexto");
        v1.mostrar();

        v2.adicionaElemento("Primeiro");
        v2.adicionaElemento("Segundo");
        v2.adicionaElemento("Terceiro");


        v2.mostrar();
        System.out.println(v2);
        System.out.println(v2.tamanho());

        System.out.println(v2.busca(0));





    }
}
