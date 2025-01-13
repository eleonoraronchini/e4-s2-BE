package Esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main { public static void main(String[] args) {
    Scanner scanner = null;
    try {
        scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di km percorsi");
        int kmPercorsi = scanner.nextInt();
        System.out.println("Inserisci il numero di litri consumati");
        int litriConsumati = scanner.nextInt();
        int risultato = kmPercorsi / litriConsumati;
        System.out.println("Risultato kmPercorsi/litriConsumati:" + risultato);
    } catch (ArithmeticException e) {
        System.out.println("Non puoi dividere per zero");
    } catch (InputMismatchException e) {
        System.out.print("Il valore inserito non è un numero");
    } catch (Exception e) {
        System.out.print("Errore nell'inserimento dei dati");
    } finally {
        scanner.close();
    }
}
}
