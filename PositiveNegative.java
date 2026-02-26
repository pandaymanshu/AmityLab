class PositiveNegative {
    int num;

    PositiveNegative(int n){
        num = n;
    }

    void check(){
        if(num >= 0)
            System.out.println(num + " is Positive");
        else
            System.out.println(num + " is Negative");
    }

    public static void main(String[] args){
        PositiveNegative obj = new PositiveNegative(-5);
        obj.check();
    }
}