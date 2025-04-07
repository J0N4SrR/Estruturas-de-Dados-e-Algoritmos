package AtividadeAvaliativa;
import java.util.Scanner;

public class MainExercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Questão 01");
        System.out.println("Empilhando os itens de cozinha:");
        Exercicio1 pilhaPratos = new Exercicio1(30);
        int resposta;

        for( int i = 0; i < 30; i++) {
            resposta = scanner.nextInt();

            if(resposta == -1) break;
            if(resposta == 0){
                pilhaPratos.desempilhar();
            }
            if(resposta > 0 && resposta <= 3){
                pilhaPratos.empilhar(resposta);
            } else {
                if(resposta == 0) {
                    System.out.println("Lavando item");
                } else { System.out.println("Item inválido");}
            }

        }
        System.out.println("Itens lavados:");
        System.out.println(pilhaPratos);

    }
}
