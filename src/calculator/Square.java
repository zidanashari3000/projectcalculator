/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author altha
 */
public class Square {
    
    double num1;
    double num2;
    public int Perpangkatan(double num1 ,double num2)
    {
        int result;
        result = (int) Math.pow(num1, num2);
        return result;
    } 
}
