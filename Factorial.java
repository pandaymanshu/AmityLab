class Factorial {
    int num;

    Factorial(int n){
        num = n;
    }

    int findFactorial(){
        int fact = 1;
        for(int i=1;i<=num;i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args){
        Factorial obj = new Factorial(5);
        System.out.println("Factorial = " + obj.findFactorial());
    }
}