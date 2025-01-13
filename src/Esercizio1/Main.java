package Esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] main(String[] args) {
        int [] numbersArr = new int[5];

        Scanner scanner = new Scanner(System.in);
        Random numberRand = new Random();
        numberRand.nextInt(1,11); //primo numero incluso, ultimo numero escluso

        for (int i=0; i<numbersArr.length; i++){
            numbersArr[i]=numberRand.nextInt(1,11);
        }
        return numbersArr;
    }

}
