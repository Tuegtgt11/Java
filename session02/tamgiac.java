package session02;

import java.util.Scanner;

public class tamgiac {
    public static void main(String[] args ){
        System.out.println("Nhap so dong:");
        Scanner num= new Scanner(System.in);
        double T=num.nextInt();

        int i=0;
        int k=0;
        int j=0;
        for (i=1;i<=T;i++){
            for (j=i;j<T;j++){
                System.out.printf(" ");
            }
            for (k=1;k<=(2*i-1);k++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
