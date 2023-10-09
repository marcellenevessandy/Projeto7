package exer2;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        double area, base, altura;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a base do triângulo: ");
        base = ler.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        altura = ler.nextDouble();

        area = base * altura;
        System.out.println("A área do triângulo é igual a " + area);
    }
}
