/*
Add your honor code statement here ...
*/
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Athletes{
	public static int[] prepareData(int[] athletes){
        /*
        Data is prepared by inserting random values 
        between 150 and 300. Data items may be assumed to 
        be unique. 
        Please refer to the sheet for the problem definiton.
        */
        // what is our range?
        int min = 150;
        // create instance of Random class
        Random randomNum = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<athletes.length; i++) {
            int weight = min + randomNum.nextInt(min);
            list.add(weight);
        }
        Collections.shuffle(list);
        for (int i=0; i<athletes.length; i++) {
             athletes[i] = list.get(i);
        }
        return athletes;
    } 
    public static void printDashes(){
        for (int i =0; i < 50; i++)
            System.out.print("-");
        System.out.println();
    } 
    public static int findLow(int[] athletes){
        int res = 0;
        /* add your logic here. 
        this method should return the lowest weight. */
        
        return res;
    }
    public static int findHigh(int[] athletes){
        int res = 0;
        /* add your logic here. 
        this method should return the highest weight. */
        
        return res;
    }
    public static void main(String[] args){
    	System.out.println("Enter the no of athletes:");
        Scanner scan = new Scanner(System.in);
        int athletes = scan.nextInt();
        int[] athletes_weight = new int[athletes];
        athletes_weight = prepareData(athletes_weight);
        System.out.println("Weight of all athletes....");
        printDashes();
        System.out.println(Arrays.toString(athletes_weight));
        printDashes();
        int lowestWeight = findLow(athletes_weight);
        System.out.println("Lowest Weight:" + lowestWeight);
        printDashes();
        int highestWeight = findHigh(athletes_weight);
        System.out.println("Highest Weight:" + highestWeight);
        printDashes();

	}
}