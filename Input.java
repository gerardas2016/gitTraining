import java.util.Scanner;

/**
 *
 * @author geras
 */
public class Input {
 public  String betkas(){
    
        Scanner reader = new Scanner(System.in);
        String name= reader.nextLine();
        reader.close();
        return name;
   
    }
}
