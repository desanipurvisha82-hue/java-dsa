import java.util.*;

public class HashMap_Frequency {
    public static void main(String [] args)
    {
        int arr[] = {7,1,1,1,6,8,9,0,1};
        HashMap<Integer,Integer> f = new HashMap<>();
        for(int i :arr)
        {
            if(f.containsKey(i))
            {
                f.put(i , f.get(i)+1);
            }
            else
            {
                f.put(i, 1);
            }
        }
        System.out.println(f);

    }
}
