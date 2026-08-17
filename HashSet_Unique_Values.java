import java.util.*;
public class HashSet_Unique_Values {
    public static void main(String[] args) {
        int arr[] = {1,2,5,5,6,1,4,9,8,7,7};
       HashSet<Integer> seen = new HashSet<>();
       HashSet<Integer> duplicate = new HashSet<>();
       for(int i :arr)
       {
        if(seen.contains(i))
        {
             duplicate.add(i);
        }
        seen.add(i);
        
       }
       System.out.println(duplicate);
        
    }
}
