/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author altha
 */
public class kalkulatorsimple {

    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction , 3 for Multiplication , 4 for division , 5 for Tangent , 6 for Cosin , 7 for CubeRoot , 8 for Sine , 9 for Square and 10 for Squareroot:");
        Scanner inp = new Scanner(System.in);
        int choose;
        choose = inp.nextInt();
        System.out.println("Enter The first num");
        num1 = inp.nextInt();
        System.out.println("Enter The 2nd num");
        num2 = inp.nextInt();
        
        kalkulatorsimple ks = new kalkulatorsimple();
        ks.operate(choose, num1, num2);
        
    }

    public double operate(int operation, int num1, int num2) {
        switch (operation) {
            case 1:
                Addition pertambahan = new Addition();
                System.out.println("The answer is " + pertambahan.Pertambahan(num1, num2));
                return pertambahan.Pertambahan(num1, num2);
            case 2:
                Subtraction pengurangan = new Subtraction();
                System.out.println("The answer is " + pengurangan.Pengurangan(num1, num2));
                return pengurangan.Pengurangan(num1, num2);
            case 3:
                Multiplication perkalian = new Multiplication();
                System.out.println("The answer is " + perkalian.Perkalian(num1, num2));
                return perkalian.Perkalian(num1, num2);
            case 4:
                Division pembagian = new Division();
                System.out.println("The answer is " + pembagian.Pembagian(num1, num2));
                return pembagian.Pembagian(num1, num2);
            case 5:
                Tangent tangent = new Tangent();
                System.out.println("The answer is " + tangent.Tan(num1));
                return tangent.Tan(num1);
            case 6:
                Cosine cosine = new Cosine();
                System.out.println("The answer is " + cosine.Cos(num1));
                return cosine.Cos(num1);
            case 7:
                CubeRoot cuberoot = new CubeRoot();
                System.out.println("The answer is " + cuberoot.cuberoot(num1));
                return cuberoot.cuberoot(num1);
            case 8:
                Sine sine = new Sine();
                System.out.println("The answer is " + sine.Sin(num1));
                return sine.Sin(num1);
            case 9:
                Square square = new Square();
                System.out.println("The answer is " + square.Perpangkatan(num1, num2));
                return square.Perpangkatan(num1, num2);
            case 10:
                SquareRoot squareroot = new SquareRoot();
                System.out.println("The answer is " + squareroot.Akar(num1));
                return squareroot.Akar(num1);
            default:
                System.out.println("Illigal Operation");
                return 0;
        }
    }
}
