package lab9;


// Create a dictionary class to store name, roll number of five
// students & display those students who roll number is even.
// Note: use roll number as key and name as value
import java.util.HashMap;
import java.util.Map;
public class q3 {
    public static void main(String[] args) {
        HashMap<Integer,String> studentDict = new HashMap<Integer,String>();
        studentDict.put(101, "John");
        studentDict.put(102, "Alice");
        studentDict.put(103, "Bob");
        studentDict.put(104, "Eve");
        studentDict.put(105, "Mike");
        System.out.println("Students with even roll numbers:");
        for (Map.Entry<Integer, String> entry : studentDict.entrySet()) {
            int rollNumber = entry.getKey();
            String name = entry.getValue();
            if (rollNumber % 2 == 0) {
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
            }
        }
    }
}
