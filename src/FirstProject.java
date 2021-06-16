import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        float price;
        float kdv;

        System.out.println("Ürün Fiyatı Giriniz");
        
        price = input.nextFloat();

        kdv = price * 0.18f;

        price = price + kdv;

        System.out.print("Ürünün KDV'li Fiyatı = " + price);





    }
}
