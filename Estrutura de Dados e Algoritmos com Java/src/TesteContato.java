import estruturas.VetorObject;
import exemploClasses.Contato;

public class TesteContato {
    public static void main(String[] args) {

        VetorObject listaContatos = new VetorObject(4);

        Contato c1 = new Contato("Carlos", "5555-1234", "carlos@email.com");
        Contato c2 = new Contato("Ana", "5555-5678", "ana@email.com");
        Contato c3 = new Contato("Lucas", "5555-8765", "lucas@email.com");
        Contato c4 = new Contato("Beatriz", "5555-4321", "beatriz@email.com");

        listaContatos.adiciona(c1);
        listaContatos.adiciona(c2);
        listaContatos.adiciona(c3);

        System.out.println(listaContatos);

    }
}
