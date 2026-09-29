package utils;

import java.util.Scanner;

public class Calculadora {
    public static double somar (double a, double b){
        return a+b;
    }
    public static double subtrair(double a, double b){
        return a-b;
    }
    public static double multiplicar (double a, double b){
        return a*b;
    }
    public static double dividir(double a, double b){
        if (b==0){
            System.out.println("Não existe divisão por isso");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um real diferente de 0");
            b = sc.nextDouble();;
            return dividir(a, b);
        }         return a/b;
    }
}
