package Exercicios;

import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {

        //1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
        //dias e mostre-a expressa apenas em dias.

        int dayA,dayB,monthA,monthB,yearA,yearB,days = 0;
        String nome;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome ? ");
        nome = input.next();

        System.out.println("Que dia você nasceu ? ");
        dayB = input.nextInt();

        System.out.println("Que mes você nasceu ? ");
        monthB = input.nextInt();

        System.out.println("Que ano você nasceu ? ");
        yearB = input.nextInt();

        System.out.println("Que dia é hoje ? ");
        dayA = input.nextInt();

        System.out.println("Que mes estamos ? ");
        monthA = input.nextInt();

        System.out.println("Que ano estamos ? ");
        yearA = input.nextInt();

        while(yearB < yearA || monthB < monthA || dayB < dayA) {
            days++;
            dayB++;
        if (dayB > 30) {
            dayB = 1;
            monthB++;
        if (monthB > 12) {
            yearB++;
            monthB = 1;

        }
        }

        }
        System.out.println("Olá " + nome +" você já viveu " + days +  " dias ");
    }
}
