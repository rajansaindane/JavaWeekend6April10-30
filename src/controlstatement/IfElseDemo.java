package controlstatement;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
        int i;

        System.out.print("Enter the value of i => ");
        Scanner scanner=new Scanner(System.in);
        i=scanner.nextInt();


        if (i%2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
