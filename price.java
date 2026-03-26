import java.util.*;

class Item {
    int code;
    float price;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        code = sc.nextInt();
        System.out.print("Enter price: ");
        price = sc.nextFloat();
    }

    void display() {
        System.out.println(code + "\t" + price);
    }

    public static void main(String[] args) {
        Item[] items = new Item[5];
        float total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            items[i].accept();
        }

        System.out.println("\nCode\tPrice");
        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }

        System.out.println("Total Price = " + total);
    }
}