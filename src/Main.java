import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;

// needs to be able to match student and tool verification
//access student database
// acceess CLOUD student database
// matching texr student database to verficiation



public class Main {
    public static void main(String[] args) throws FileNotFoundException  {
        System.out.println("hi aarobbbn");
        int  counter = 1 ;

      File file1 = new File("src/resources/names.txt");
      File file2 = new File("src/resources/sampleTool_1.txt");
      Scanner scan1 = new Scanner(file1);
      Scanner scan2 = new Scanner(file2);
      Scanner kb = new Scanner(System.in);
        System.out.println("Which student do you want to check");

      while (scan1.hasNextLine()) {
        String data = scan1.nextLine();
        System.out.println(counter+ "." + " " + data);
        counter++;
      }
      int ans = kb.nextInt();
      switch (ans) {
          case 1:
              System.out.println(scan2.nextLine());
              break;

          case 2:
              scan2.nextLine();
              System.out.println(scan2.nextLine());
              break;

          case 3:
              scan2.nextLine();
              scan2.nextLine();
              System.out.println(scan2.nextLine());
              break;

          case 4:
              scan2.nextLine();
              scan2.nextLine();
              scan2.nextLine();
              System.out.println(scan2.nextLine());
              break;
      }


     scan1.close();
      scan2.close();
      kb.close();


  }


}
