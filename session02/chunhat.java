package session02;

import java.util.Scanner;

public class chunhat {
    public static void main(String[] args ){
        System.out.println("So dong =");
        Scanner num= new Scanner(System.in);
        double K=num.nextInt();

        int i=0;
        int j=0;
        for(i=1;i<=K;i++){
            for (j=0;j<=(3*K);j++){
                System.out.printf("|---");
            }
            System.out.printf("\n");
        }
    }
}
