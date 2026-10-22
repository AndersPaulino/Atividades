package org.example.service;

import java.util.Scanner;

public class TipoNumeroSerivce {

    Scanner sc = new Scanner(System.in);

    public void calcularTipoNumero(){
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();

        int[] numeros = {A, B, C, D, E};

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                pares++;
            }

            if (numeros[i] % 2 != 0) {
                impares++;
            }

            if (numeros[i] < 0) {
                negativos++;
            }

            if (numeros[i] > 0) {
                positivos++;
            }
        }

        System.out.println(pares + " " + "valor(es) par(es)");
        System.out.println(impares + " " + "valor(es) impar(es)");
        System.out.println(positivos + " " + "valor(es) positivo(s)");
        System.out.println(negativos + " " + "valor(es) negativo(s)");

        sc.close();
    }

    public void calcularMaiorPosicao(){
        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 100; i++) {
            int x = sc.nextInt();

            if (x > maior) {
                maior = x;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }

    public void calcularIntervaloEntreNumeros(){
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println("Quantidades de Números entre(in) 10 e 20 e quantos estão fora(out)!");
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
