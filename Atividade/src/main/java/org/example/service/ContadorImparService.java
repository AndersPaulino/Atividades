package org.example.service;

import java.util.Scanner;

public class ContadorImparService {

    Scanner sc = new Scanner(System.in);

    public void calcularQtdeNumerosImpares(){
        int A = sc.nextInt();

        for(int i = 1; i <= A; i++){
            if(i %2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
    public void calcularProximosImpares(){
        int A = sc.nextInt();
        int contador = 0;

        for(int i = 0; contador < 6; i++){
            if((A + i) %2!=0){
                System.out.println(A+i);
                contador++;
            }
        }
        sc.close();
    }
}
