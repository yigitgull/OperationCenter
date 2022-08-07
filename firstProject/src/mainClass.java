import java.lang.FunctionalInterface;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        OperationCenter.giveCurrent().AddOperation("ADDING", new xAdd());
        OperationCenter.giveCurrent().AddOperation("EXTRACTING", new IOperation() {
            @Override
            public int Do(int first, int second) {
                return first-second;
            }
        });
        OperationCenter.giveCurrent().AddOperation("MULTIPLY", (first, second) -> first * second);
        GetInfo getInfo = new GetInfo();
        getInfo.getInfo();
        int result = 0;



      try {
           result = OperationCenter.giveCurrent().Do(getInfo.first, getInfo.second, getInfo.operation);


      }
      catch (Exception e){
          System.out.println(e);

      }
    System.out.println(result);
    }
}