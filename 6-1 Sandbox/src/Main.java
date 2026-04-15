//import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[1000];
        int limit = arr.length;
        int count8 = 0;

        for (int i = 0; i < limit; i++) {
            int randNum = rand.nextInt(1000) + 1;
            if (randNum % 8 == 0) {
                count8++;
            }
        }

        int[] multsOf8 = new int[count8];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            multsOf8[index] = arr[i];
            index++;
        }

        System.out.println();

    }
}
