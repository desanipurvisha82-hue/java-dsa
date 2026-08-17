import java.util.*;

public class HashMapFrequencyCount {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,2,2,2,5,5,7,7,0,1,4,2,6,7};
        HashMap<Integer,Integer> f =new HashMap<>();

        for(int i : arr)
        {
           if(f.containsKey(i))
           {
            f.put(i , f.get(i)+1);

           }
           else
           {
            f.put(i,1);
           }
        }
        System.out.println(f);
    }
}
