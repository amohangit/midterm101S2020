/*
   Add your honor code statement here ...
*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MovieRating{
   private static int[] movies;
   private static int size = 0;
   private static int capacity = 5;
   public static void fillMovieRatings(){
      Scanner scan = new Scanner(System.in);
      Random rand = new Random(); 
      while(true){
         /* movie ratings are from 0 to 100, 
         randomize distribution. */
         for (int i = size; i < movies.length; i++){
               movies[i] = rand.nextInt(100);
               size++;
         }
         System.out.println("Do you want to add more movie ratings?");
         char response = Character.toUpperCase(scan.next().charAt(0));
         if (response == 'Y')
            addMoreMovies();
         else
            break;
      }
   }
   public static void addMoreMovies(){
      /* increment the array size by 5 here */
      
   }
   public static void printDashes(){
      for (int i =0; i < 50; i++)
         System.out.print("-");
      System.out.println();
   } 
   public static int countOfBad(){
        int res = 0;
        /* add your logic here. 
        this method should return the number of bad movies. 
        find movies with ratings < 35 */
        
        return res;
    }
    public static int countOfGood(){
        int res = 0;
        /* add your logic here. 
        this method should return the number of good movies.
        find movies with ratings > 65 */
        
        return res;
    }
   public static void main(String[] args){
      movies = new int[capacity]; 
      fillMovieRatings();
      printDashes();
      System.out.println(Arrays.toString(movies));
      printDashes();
      int badMovies = countOfBad();
      System.out.println("Number of bad movies:" + badMovies);
      printDashes();
      int goodMovies = countOfGood();
      System.out.println("Number of good movies:" + goodMovies);
      printDashes();


   }
}