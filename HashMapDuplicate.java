import java.util.*;
public class HashMapDuplicate {
    public static void main(String[] args) {
        int arr[] =  {1,2,1,1,5,6,8,9,0 ,2,2};
    HashMap<Integer, Integer> d = new HashMap<>();

    for(int i : arr)
    {
        if(d.containsKey(i))
        {
            System.out.println("Duplicate Values" + i);
            
        }
        else{
            d.put(i, 1);
        }
    }
    System.out.println(d);
    }
}
