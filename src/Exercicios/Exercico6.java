package Exercicios;
import java.math.*;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Exercico6 {
    public static void main(String[] args) {

        double	x1, y1 ,x2, y2,d = 0;
        double pow;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o valor da x1:");
        x1 = input.nextDouble();

        System.out.println("Por favor, digite o valor da x2:");
        x2 = input.nextDouble();

        System.out.println("Por favor, digite o valor da y1:");
        y1 = input.nextDouble();

        System.out.println("Por favor, digite o valor da y2:");
        y2 = input.nextDouble();

        d = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1), 2.0));

        System.out.println("Seu resultado calculado foi: "+d);








    }
}
