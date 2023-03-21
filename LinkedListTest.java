
import java.util.Iterator;
import java.util.LinkedList;
class LinkedListTest
{

    public static void main(String[] args) {
        LinkedList al=new LinkedList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("AAA");
        al.add(20);
        al.add("BBB");
        //Calcluate size of the ArrayList

        System.out.println("Calcluate size of the ArrayList\n");
        System.out.println("size of the ArrayList : "+al.size());

        System.out.println("Iteration of ArrayList by using for Loop\n");
        
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
        
    }
}
