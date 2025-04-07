package AtividadeAvaliativa;
import estruturas.Fila;

import java.util.Scanner;

public class MainExercicio02 {
    public static void main(String[] args) {
        Fila balsaA = new Fila(6);
        Fila balsaB = new Fila(6);
        int cont = 0;

        while(cont < 12){
        System.out.println("Adicione o id de um carro:");
        Scanner scanner = new Scanner(System.in);
        String carro = scanner.nextLine();
        if (balsaA.getTamanho() < 6) {
            balsaA.enfileira(carro);
        } else{
            if (balsaB.getTamanho() < 6) balsaB.enfileira(carro);
        }
        if(balsaA.estaCheio() && balsaB.estaCheio()) System.out.println("A balsa está cheia!");
        cont++;
        }

        System.out.printf("Fileira A: %s \n", balsaA);
        System.out.printf("Fileira B: %s \n", balsaB);

        for(int i = 0; i < 6; i++ ){
        System.out.printf("Desembarcando Fileira A - Carro: %s \n", balsaA.desenfileira());
        }
        for(int i = 0; i < 6; i++ ){
            System.out.printf("Desembarcando Fileira B - Carro: %s \n", balsaB.desenfileira());
        }

    }
}
