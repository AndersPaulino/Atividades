package org.example.service;
import java.util.Scanner;

public class ExperienciaCobaiasService {
    Scanner sc = new Scanner(System.in);

    public void calcularCobaias(){
        int n = sc.nextInt();

        int cobaias = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < n; i++) {

            int quantidade = sc.nextInt();
            char tipo = sc.next().charAt(0);

            cobaias += quantidade;

            if (tipo == 'C') {
                coelhos += quantidade;
            } else if (tipo == 'R') {
                ratos += quantidade;
            } else if (tipo == 'S') {
                sapos += quantidade;
            }
        }

        double percentualCoelhos = (coelhos * 100.0) / cobaias;
        double percentualRatos = (ratos * 100.0) / cobaias;
        double percentualSapos = (sapos * 100.0) / cobaias;

        System.out.println("Total: " + cobaias + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

        sc.close();
    }
}
