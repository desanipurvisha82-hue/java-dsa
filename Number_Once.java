import java.util.*;
public class Number_Once {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 4, 2, 5, 3};
        HashMap<Integer , Integer > num = new HashMap<>();

        for(int i : arr)
        {
            if(num.containsKey(i))
            {
                num.put(i , num.get(i)+1);
            }
            else
            {
                num.put(i, 1);
            }
        }
        System.out.println(num);

        for(Map.Entry<Integer,Integer>entry: num.entrySet())
        {
if(entry.getValue() == 1)
{
    System.out.println(entry.getKey());
}
        }
    }
}
