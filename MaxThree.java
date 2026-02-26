class MaxThree {
    int a,b,c;

    MaxThree(int x,int y,int z){
        a=x; b=y; c=z;
    }

    void findMax(){
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        System.out.println("Maximum = "+max);
    }

    public static void main(String[] args){
        MaxThree obj=new MaxThree(10,25,18);
        obj.findMax();
    }
}