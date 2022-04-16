package Exercicios;
import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args) {


   // 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
    //expressa em segundos e mostre-o expresso em horas, minutos e segundos.

             double sec, min, hours;
             Scanner input = new Scanner(System.in);

             System.out.println("Quantos segundos durou seu evento : ");
             sec = input.nextInt();

             min = (sec/60);
             hours = (min/60);

             System.out.println("Em segundos é : "+sec+" segundos");
             System.out.println("Em minutos é : "+min+ " minutos");
             System.out.println("Em horas é : "+hours+" horas");
}
}

