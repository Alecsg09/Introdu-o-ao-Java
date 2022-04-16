package Exercicios;
import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args) {

        //Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
        //aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
        //respectivamente.


                double grade1, grade2, finalgrade, res;
                Scanner input = new Scanner(System.in);


                System.out.println("Primeira nota : ");
                grade1 = input.nextInt();

                System.out.println("Segunda nota : ");
                grade2 = input.nextInt();

                System.out.println("Nota final : ");
                finalgrade = input.nextInt();

                res = (grade1*0.2) + (grade2*0.3) + (finalgrade*0.5);

                System.out.println("Sua Média Final é: "+res);






    }
}
