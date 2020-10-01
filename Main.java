import java.util.Scanner;

/**
 *This program tells the user the maximum integer
 * @author Tolga Nurtein
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    //get user integer
     System.out.println("Chose 3 integers");
     int integer1 = input.nextInt();
     int integer2 = input.nextInt();
     int integer3 = input.nextInt();

    //determine which number is greater
      if (integer1 > integer2 && integer1 > integer3){
      System.out.println("The maximum number of your choices was " + integer1);
    
      }else if (integer2 > integer1 && integer2 > integer3){
      System.out.println("The maximum number of your choices was " + integer2);
    }
    else if (integer3 > integer1 && integer3 > integer2){
      System.out.println("The maximum number of your choices was " + integer3);
    }
    }
    }
    

