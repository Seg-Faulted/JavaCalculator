
import java.util.Scanner;
public class Main {
    public  static void main(String[] args) {

        String regex = "[ ]";

        System.out.println("welcome to a simple calculator.\n");
        System.out.print("Please enter a number, format: 1 + 2, spaces necessary: ");

        Scanner reader = new Scanner(System.in);
        String math_input = reader.nextLine();

        if ( math_input.isEmpty()) {
            System.out.print("You entered nothing. Please re enter a number: ");
            math_input = reader.nextLine();
            if ( math_input.isEmpty()) {
                System.out.println("You entered nothing too many times. Please re run the application");
            }
        }
        reader.close();
        math_input.trim();

        String[] math_array = math_input.split(regex);

            if (math_array[1].contains("*")) {
                int x = Integer.parseInt(math_array[0]);
                int y = Integer.parseInt(math_array[2]);
                int resultant = x * y;
                System.out.println(resultant);
           // }
        }


    }


}






