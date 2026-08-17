
import java.util.HashMap;
import java.util.Map;

public class Most_Frequent_Number {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 3, 2, 4, 5, 2, 2};
        HashMap<Integer,Integer> f = new HashMap<>();
        int max = 0;
        int key =0;
        for(int i : arr)
        {
            if(f.containsKey(i))
            {
                f.put(i,f.get(i)+1);
            }
            else
            {
                f.put(i, 1);
            }
        }
        System.out.println(f);

        for(Map.Entry<Integer,Integer> entry : f.entrySet())
        {
            if(entry.getValue()>1)
            {
                max = entry.getValue();
                key = entry.getKey();

                
         System.out.println("Most frequent number: " + key);
System.out.println("Frequency: " + max);
            }
        }

   
    }

}


// for(Map.Entry<Integer,Integer> entry : f.entrySet())
// {
//     if(entry.getValue() > 1)
//     {
//         System.out.println(entry.getKey() + " → " + entry.getValue());
//     }
// }

// for numbers which appears more than one time