import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OperationCenter {
    public Map<String, IOperation> opMap;
    private static OperationCenter _current = null;

    public static OperationCenter giveCurrent(){
        if(_current == null){
            _current = new OperationCenter();
        }
        return _current;
    }

    private OperationCenter(){
        this.opMap = new HashMap<>();

        }




    public OperationCenter AddOperation(String operationName, IOperation operation){
        opMap.put(operationName, operation);
        return this;


    }

    public boolean Remove (String operationName){
        if (this.opMap.containsKey(operationName)){
             this.opMap.remove(operationName);
             return true;
        }
        else{
            return false;
        }

    }

    public int Do(int first, int second, String operation) throws Exception {
        int result;

        if(this.opMap.containsKey( operation )){
            result = this.opMap.get(operation).Do(first, second);
        }
        else{
            throw new Exception("There is no such an operation");
        }
        return result;
    }
}
