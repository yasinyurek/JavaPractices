import java.util.Scanner;

public class FirstProject {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);


        // -- KDV HESAPLAYAN PROGRAM --//
        /*float price;
        float kdv;

        System.out.println("Ürün Fiyatı Giriniz");
        
        price = input.nextFloat();

        kdv = price * 0.18f;

        price = price + kdv;

        System.out.print("Ürünün KDV'li Fiyatı = " + price);*/

        // -- ---------------- --//

        // -- TAKSİMETRE --//

        double distance;
        double price;
        double startPrice = 10;
        double kmPrice = 2.20;


        System.out.println("Gidilen Mesafeyi Giriniz");

        distance = input.nextDouble();

        price = ((distance * kmPrice) + startPrice);
        if (price <= 20)
            System.out.println(" Ücret = 20 TL");
        else
        System.out.print("Ücret :" +price);












    }
}
