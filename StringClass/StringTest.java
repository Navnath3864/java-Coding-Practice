package StringClass;

public class StringTest {
    public static void main(String[] args) {
        char [] ch = {'N','a','v','n','a','t','h'};
        String str = new String(ch);
        System.out.println(str);
        String s = "Nav";

        System.out.println("Java String Class Methods \n");

        // char charAt(int index) :--> it returns char value for particular index.
        System.out.println(str.charAt(2));

        System.out.println(str.substring(3));
        System.out.println(str.substring(2,6));

        System.out.println(str.isEmpty());
        System.out.println(str.concat(s));

        System.out.println(str.replace(str, s));

        System.out.println(str.equals(s));

        System.out.println(str.intern());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        
        System.out.println(str.indexOf('v'));
        //int length ():--> it returns String Length.

    }
}
