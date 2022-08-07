import java.util.Scanner;
import java.util.*;


    public class GetInfo {

        int first = 0;
        int second = 0;
        String operation = null;

        public void getInfo(){
            Scanner scanObject = new Scanner(System.in);

            System.out.println("Enter a first number");
            String firsta = scanObject.nextLine();
            first = Integer.parseInt(String.valueOf(firsta));

            System.out.println("Enter a second number");
            String seconda = scanObject.nextLine();
            second = Integer.parseInt(String.valueOf(seconda));

            System.out.println("Enter an operation name");
            operation  = scanObject.nextLine();




        }
    }

