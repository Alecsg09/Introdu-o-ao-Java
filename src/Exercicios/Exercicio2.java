package Exercicios;
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {

        //2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
        //expressa em anos, meses e dias.

        int days, months, years;
        Scanner input = new Scanner(System.in);


        System.out.println("Após pesquisa quantos dias você já viveu ?  ");
        days = input.nextInt();

        years = days/365;
        months = years*12;

        System.out.println("Posso dizer que você tem  " +years+ " anos, ou " +months+ " meses, ou "+days+ " dias.");
    }
}
