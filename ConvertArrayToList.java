
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ConvertArrayToList {
    public static void main(String[] args) {
        String [] array = {"java","c++","c","python","Ruby"};
        System.out.println("Printing arrays: \n"+Arrays.toString(array));
        
        List <String> listele = new ArrayList<String>();
        for(String obj:array)
        {
            listele.add(obj);
        }

        System.out.println("Print the given List using for each loop\n");
        for(String obj1 : listele)
        {
            System.out.println(obj1);
        }

    }
}
