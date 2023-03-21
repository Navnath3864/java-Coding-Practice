import java.util.ArrayList;
import java.util.Iterator;
class ArrayListTest
{

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
       // al.add("a");
        al.add(2);
//al.add("b");
        //Calcluate size of the ArrayList


        System.out.println("Calcluate size of the ArrayList\n");
        System.out.println("size of the ArrayList : "+al.size());

        System.out.println("Iteration opf ArrayList by using for Loop\n");
        
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i)); // get method/function is used to get the specific element
        }
        System.out.println("Iteration of ArrayList by using iterator\n");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            //Object obj = itr.next();
            //String s = (String) obj;
            System.out.println(itr.next());
        }

        System.out.println("Iterating the ArrayList using for-each-loop");

        for(Integer s1 : al )
        {
            System.out.println(s1);
        }
        
    }
}
