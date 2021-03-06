package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Generate500RandomNumbers {

public static void main(String[] args) {

	int start = 100;
    int end = 1001;
    int counter = 500;

    int smallest;
    int greatest;
    int randomInt ;

    int numbers [] = new int[counter];
    Random random = new Random(); 

    randomInt = random.nextInt(end-start) + start;
    numbers [0] = randomInt;

    smallest = randomInt;
    greatest = randomInt;


   // System.out.println("0th Greatest : " + greatest + "\n");
    // System.out.println("0th Smallest : " + smallest + "\n");

    for(int i=1;i<counter;i++) {

        numbers[i] = random.nextInt(end-start) + start;
        smallest = Math.min(smallest,numbers[i]);
        greatest = Math.max(greatest,numbers[i]);
        
        System.out.println("Random numbers: " + Arrays.toString(numbers) + "\n\n");
                     
         System.out.println(i + "th Smallest : " + smallest + "\n");
        
}
	
} 



}
