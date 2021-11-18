package com.thoughtworksProgram;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);

        int number=scanner.nextInt();
        int count=0;
        while (number != 1)
        {
            count++;
            System.out.print(number + " ");

            if (number%2== 1)
                number = 3 * number + 1;
            else
                number = number / 2;
        }

        // Print 1 at the end
        System.out.print(number + " "+count);
    }
}
