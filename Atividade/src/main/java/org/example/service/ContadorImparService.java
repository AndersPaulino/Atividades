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
}
