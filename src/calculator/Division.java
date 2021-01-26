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
public class Division {
    
    int num1, num2;
    public double Pembagian(double num1, double num2)
    {
        if (num2 == 0)
        {
            throw new ArithmeticException("divition by zero");
	}    
        double result;
        result = num1 / num2;
        return result;
    }
}
