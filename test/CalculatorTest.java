
import calculator.kalkulatorsimple;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import calculator.*;


public class CalculatorTest {
    
     public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddition()
    {
        System.out.println("Penjumlahan");
        int num1 = 2;
        int num2 = 2;
        Addition penjumlahan = new Addition();
        int expResult = 4;
        int result = penjumlahan.Pertambahan(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSubtraction()
    {
        System.out.println("Pengurangan");
        int num1 = 4;
        int num2 = 2;
        Subtraction pengurangan = new Subtraction();
        int expResult = 2;
        int result = pengurangan.Pengurangan(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMultiplication()
    {
        System.out.println("Perkalian");
        int num1 = 4;
        int num2 = 2;
        Multiplication perkalian = new Multiplication();
        int expResult = 8;
        int result = perkalian.Perkalian(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testDivision()
    {
        System.out.println("Pembagian");
        double num1 = 2.0;
        double num2 = 2.0;
        Division pembagian = new Division();
        double expResult = 1.0;
        double result = pembagian.Pembagian(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        double num1 = 15.0;
        double num2 = 0;
        Division pembagian = new Division();        
        pembagian.Pembagian(num1, num2);
    }
    
    @Test
    public void testSquare()
    {
        System.out.println("Perpangkatan");
        int num1 = 2;
        int num2 = 2;
        Square perpangkatan = new Square();
        int expResult = 4;
        int result = perpangkatan.Perpangkatan(num1, num2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSquareRoot()
    {
        System.out.println("Akar Persegi");
        double num1 = 16.0;
        SquareRoot akar = new SquareRoot();
        double expResult = 4.0;
        double result = akar.Akar(num1);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCubeRoot()
    {
        System.out.println("Akar Kubik");
        double num1 = 8.0;
        CubeRoot akar = new CubeRoot();
        double expResult = 2.0;
        double result = akar.cuberoot(num1);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSine()
    {
        System.out.println("Sin");
        double num1 = 0;
        Sine sin = new Sine();
        double expResult = 0;
        double result = sin.Sin(num1);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCosine()
    {
        System.out.println("Cos");
        double num1 = 0;
        Cosine cos = new Cosine();
        double expResult = 1;
        double result = cos.Cos(num1);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTangent()
    {
        System.out.println("Tan");
        double num1 = 0;
        Tangent tan = new Tangent();
        double expResult = 0;
        double result = tan.Tan(num1);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testOperate(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(3, instance.operate(1, 1, 2), 0);
    }
    
    @Test
    public void testOperateSubstraction(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(3, instance.operate(2, 4, 1), 0);
    }
     
    @Test
    public void testOperateTangent(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(-0.27190061199, instance.operate(5, 50, 1), 0);
    }
    
      @Test
    public void testOperatePerkalian(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(10, instance.operate(3, 2, 5), 0);
    }
     
      @Test
    public void testOperatePembagian(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(10, instance.operate(4, 20, 2), 0);
    }
    
       @Test
    public void testOperateCos(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(0.96496602849, instance.operate(6, 50, 1), 0);
    }
    
      @Test
    public void testOperateCubeRoot(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(4, instance.operate(7, 64, 1), 0);
    }
    
          @Test
    public void testOperateSine(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(-0.2623748537, instance.operate(8, 50, 1), 0);
    }
    
         @Test
    public void testOperateSquare(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(4, instance.operate(9, 2, 2), 0);
    }
    
         @Test
    public void testOperateSquareRoot(){
        System.out.println("Calculator");
        kalkulatorsimple instance = new kalkulatorsimple();
        assertEquals(2, instance.operate(10, 4, 1), 0);
    }
    
    
    
    
    @Test
    public void testMain(){
        System.out.println("Calculator");
        String args[] = null;
        kalkulatorsimple.main(args);
    }
    
}
