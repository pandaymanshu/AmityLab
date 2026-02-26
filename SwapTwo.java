class SwapTwo {
    int num;

    SwapTwo(int n){
        num=n;
    }

    void swap(SwapTwo other){
        int temp=this.num;
        this.num=other.num;
        other.num=temp;
    }

    void display(){
        System.out.println(num);
    }

    public static void main(String[] args){
        SwapTwo obj1=new SwapTwo(5);
        SwapTwo obj2=new SwapTwo(10);

        obj1.swap(obj2);

        System.out.print("After Swap: ");
        obj1.display();
        obj2.display();
    }
}