import java.util.HashMap;
import java.util.Map;

public class Most_Frequent_Number_s {

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 1, 4, 2, 5, 3};

        HashMap<Integer, Integer> num = new HashMap<>();

        // Count frequency
        for(int i : arr)
        {
            if(num.containsKey(i))
            {
                num.put(i, num.get(i) + 1);
            }
            else
            {
                num.put(i, 1);
            }
        }

        System.out.println(num);

        int max = 0;
        int mostFrequent = 0;

        // Find maximum frequency
        for(Map.Entry<Integer, Integer> entry : num.entrySet())
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Frequency: " + max);
    }
}