package appimc;

import java.util.Scanner;

public class Main {

    static Pessoa[] pessoas = new Pessoa[5]; //Armazenando no vetor

    public static void main(String[] args) {

        lerPessaoas();
        mostrarPessoas();

    }

    private static void lerPessaoas() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os dados da pessoa " + (i + 1));
            //(i + 1)); TRANFORMA A PESSOA 0 EM PESSOA 
            System.out.print("Nome: ");
            Pessoa p = new Pessoa();
            p.nome = new Scanner(System.in).nextLine();
            System.out.print("peso: ");
            p.peso = new Scanner(System.in).nextFloat();
            System.out.print("altura: ");
            p.altura = new Scanner(System.in).nextFloat();
            pessoas[i] = p;
        }
    }

    private static void mostrarPessoas() {
        for (int i = 0; i < 5; i++) {
            Pessoa p = pessoas[i];
            System.out.println(p.nome+" | "+//Concatenou tudo no mesmo parentese com o +
                               p.calcularImc()+" | "+ 
                               p.interpretacao());
        }

    }

}
