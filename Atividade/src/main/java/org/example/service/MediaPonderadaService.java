package org.example.service;
import java.util.Scanner;

public class MediaPonderadaService {
    Scanner sc = new Scanner(System.in);

    public void calcularMedia() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite as 3 notas do caso " + (i + 1) + ":");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();

            float soma = ((a * 2) + (b * 3) + (c * 5)) / 10;

            System.out.printf("Média Ponderada: %.1f%n", soma);
        }

        sc.close();
    }
}
