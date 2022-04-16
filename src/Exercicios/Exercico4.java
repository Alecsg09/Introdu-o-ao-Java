package Exercicios;

import java.util.Scanner;

public class Exercico4 {

    public static void main(String[] args) {

          int a, b, c, r, s, d;

          Scanner input = new Scanner(System.in);

          System.out.print("Escolha um numero para A: ");
          a = input.nextInt();

          System.out.println("Escolha um numero para B: ");
          b = input.nextInt();

          System.out.println("Escolha um numero para C: ");
          c = input.nextInt();


          r = (a + b) * (a + b);

          s = (b + c) * (b + c);

          d = (r + s)/2;

          System.out.println("Se R é : "+r);
          System.out.println("E o valor de S é : "+s);
          System.out.println("O resultado final é : "+d);
}
}


