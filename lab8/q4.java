package lab8;

import java.lang.String;
public class q4 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Hey ");
        System.out.println("Before:"+str);
        str.append("Siri");
        System.out.println("Append:"+str);
        str.insert(4,"Cortana ");
        System.out.println("Insert:"+str);
        str.replace(4,11,"___");
        System.out.println("Replace:"+str);
    }
}
