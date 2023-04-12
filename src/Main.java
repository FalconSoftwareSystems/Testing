import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws FileNotFoundException  {

  
      
    try {
      File file1 = new File("src/resources/names.txt");
      Scanner scan1 = new Scanner(file1);
      while (scan1.hasNextLine()) {
        String data = scan1.nextLine();
        System.out.println(data);
      }
     scan1.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      
  }
}
