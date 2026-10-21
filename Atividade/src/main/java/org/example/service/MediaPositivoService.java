package org.example.service;
import java.util.Scanner;

public class MediaPositivoService {
    Scanner sc = new Scanner(System.in);

    public void calcularMediaPositivo(){
        System.out.println("Digite os 6 números! ");
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float D = sc.nextFloat();
        float E = sc.nextFloat();
        float F = sc.nextFloat();

        float[] numeros = {A, B, C, D, E, F};

        int quantidadePositivos = 0;
        float somaPositivos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                quantidadePositivos++;
                somaPositivos += numeros[i];
            }
        }

        float media = somaPositivos / quantidadePositivos;

        System.out.println(quantidadePositivos+" "+"valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();
    }
}
