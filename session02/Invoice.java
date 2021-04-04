package session02;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args ){
        System.out.println("Enter the number of Shirts to order:");
        Scanner Shirt= new Scanner(System.in);
        double QuaShirts=Shirt.nextInt();
        System.out.println("Enter the number of Trouser to order;");
        Scanner Trous= new Scanner(System.in);
        double QuaTrouser=Trous.nextInt();
        double TotalShirts = QuaShirts*300;
        double TotalTrouser = QuaTrouser*700;
        double Total = TotalShirts + TotalTrouser;
        double Giamgia=0;
        double points=0;
        if (Total>3000){
            Giamgia=Total/10;
            points=Total/100;
            double NetTotal = Total-Giamgia;
        }
        else{
            Giamgia=0;
            points=0;
            double NetTotal = Total-Giamgia;
        }

        System.out.println("Item        Quantity    price       Total");
        System.out.println("--------------------------------------------------");

        System.out.printf("Shirts        %.0f         300     \t%.2f",QuaShirts,TotalShirts);
        System.out.printf("\nTrouser       %.0f         700     \t%.2f",QuaTrouser,TotalTrouser);
        System.out.println("\n--------------------------------------------------");
        System.out.printf("Discount                            %.0f",Giamgia);
        System.out.println("\n--------------------------------------------------");
        System.out.printf("Net Total                           %.0f",Total-Giamgia);
        System.out.println("\n--------------------------------------------------");
        System.out.printf("Points Earned        %.0f",points);
        System.out.println("\nThank You!");
    }
}
