package contador;

import java.util.ArrayList;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametroDois = scanner.nextInt();


        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }

        scanner.close();
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 0; i <= contagem; i++) {
            System.out.println("Interação : " + i);
        }
    }
}

