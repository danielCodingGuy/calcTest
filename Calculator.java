public class Calculator {
    public int addNumbers(int a, int b){
        return a + b;
    }
    public int subNumbers(int a, int b){
        return a - b;
    }
    public int mulNumbers(int a, int b){
        return a * b;
    }
    public int divNumbers(int a, int b){
        return a / b;
    }
    public double sqrtNumbers (int a) {
        return Math.sqrt(a);
    }
    public double expNumbers (int a, int b) {
        double exp =  Math.pow(a,b);
        return exp;
    }
}

