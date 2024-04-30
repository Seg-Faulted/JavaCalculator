
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;
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

            if (Objects.equals(math_array[1], "*")) {
                double x = Double.parseDouble(math_array[0]);
                double y = Double.parseDouble(math_array[2]);
                double product = x * y;
                System.out.println(product);

            }else if (Objects.equals(math_array[1], "**"))  {
                double  x = Double.parseDouble(math_array[0]);
                double y = Double.parseDouble(math_array[2]);
                double power =  Math.pow(x, y);
                System.out.println(power);
            }

            else if (Objects.equals(math_array[1], "/")) {
                double x = Double.parseDouble(math_array[0]);
                double y = Double.parseDouble(math_array[2]);
                double dividend = x / y;
                System.out.println(dividend);
            } else if (Objects.equals(math_array[1],"+")) {
                double x = Double.parseDouble(math_array[0]);
                double y = Double.parseDouble(math_array[2]);
                double resultant = x + y;
                System.out.println(resultant);
            }else if (math_array[1].contains("-")) {
                double x = Double.parseDouble(math_array[0]);
                double y = Double.parseDouble(math_array[2]);
                double difference = x - y;
                System.out.println(difference);
            }

            else {
                System.out.println("unsupported operation, it might come in the future for, modulo, etc.");
            }

        System.out.println(Arrays.toString(math_array));



    }




}






