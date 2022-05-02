package somethingnew.com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int[] ages = {44, 66, 22, 35, 12, 22, 15, 15, 13};
        int count = 0;
        int teenagercount = 0;
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        for (int i = 0; i < ages.length; i++) {
            // System.out.println(ages[i]);

            if (ages[i] > 30) {
                System.out.println(ages[i]);
                count++;

            }
            if (ages[i] > 12 && ages[i] <= 19) {
                teenagercount++;


            }

        }

        System.out.println(count + " are above 30 ");
        System.out.println(teenagercount + " are teenager ");
    }
}
