import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static int[][] randomizer(int ko) {
        Random r = new Random();
        int[][] a = new int[ko][ko];
        for (int q = 0; q < ko; q++) {
            for (int w = 0; w < ko; w++) {
                a[q][w] = r.nextInt(10);
            }
        }
        return a;
    }
    public static int[][] summizer(int ko, int a1[][], int a2[][]){
        int[][] aa3 = new int[ko][ko];
        for (int q = 0; q < a1.length; q++) {
            for (int w = 0; w < a1[q].length; w++) {
                aa3[q][w] = a1[q][w] + a2[q][w];
            }
        }
        return(aa3);
    }

    public static void main(String[] args) {
        Scanner ku = new Scanner(System.in);
        System.out.print("Wpisz liczbę: ");
        int ko = ku.nextInt();
        int[][] a1 = randomizer(ko);
        System.out.println("Pierwsza tablica:");
        System.out.println(Arrays.deepToString(a1));
        int[][] a2 = randomizer(ko);
        System.out.println("Druga tablica:");
        System.out.println(Arrays.deepToString(a2));
        System.out.println("Suma:");
        System.out.println(Arrays.deepToString(summizer(ko, a1, a2)));
    }
}
