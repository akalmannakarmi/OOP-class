package lab8;
// For the given string The Sun rises in the east and sets in the west Calculate length of entire
// string, index of “i” & last index of “st”.
import java.lang.String;
public class q3 {
    public static void main(String[] args) {
        String str="The Sun rises in the east and sets in the west";
        System.out.println("Length:"+str.length());
        System.out.println("Index of 'i':"+str.indexOf('i'));
        System.out.println("Last Index of 'st':"+str.lastIndexOf("st"));
    }
}
