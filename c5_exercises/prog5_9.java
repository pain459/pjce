
// Java program to sort hashmap by values
import java.util.*;
import java.lang.*;

public class prog5_9 {

    // function to sort hashmap by values
    public static HashMap<String, Double> sortByValue(HashMap<String, Double> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1,
                    Map.Entry<String, Double> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Double> temp = new LinkedHashMap<String, Double>();
        for (Map.Entry<String, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    // Driver Code
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Program will generate low scoring student name with marks.");
        System.out.print("Enter the number of entries you want to verify: ");
        int numberOfRecords = input.nextInt();
        HashMap<String, Double> hm = new HashMap<String, Double>();
        while (numberOfRecords > 0) {
            System.out.print("Enter student name: ");
            String studentName = input.next();
            System.out.print("Enter student marks: ");
            double studentMarks = input.nextDouble();
            hm.put(studentName, studentMarks);
            numberOfRecords--;
        }
        Map<String, Double> hm1 = sortByValue(hm);

        // print the sorted hashmap
        for (Map.Entry<String, Double> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
        // System.out.println(hm1);
    }
}
