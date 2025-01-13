package Esercizio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbersArr = new int[5];

        Scanner scanner = new Scanner(System.in);
        int randomValue = (int) (Math.random()*10+1);

        for(int i=0; i<numbersArr.length; i++){
            System.out.println(numbersArr[randomValue]);
        }
    }
}
