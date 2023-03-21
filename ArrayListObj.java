import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListObj {
    public static void main(String[] args) {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add("Navnath");
        arr.add(3);
        arr.add("Navnath"); // store / Allow duplicate values
        arr.add(2);
        arr.add("Zeli");
        //calculate size of the List
        System.out.println("Size of the List is : "+arr.size());
    // iterate list using iterator        
        Iterator itr = arr.iterator();
        while(itr.hasNext())
        {
        
            System.out.println(itr.next());

        }
    }

}
