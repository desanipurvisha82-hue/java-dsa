import java.util.*;
public class LeetCode_217 {
    
   public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        HashMap<Integer , Integer> d = new HashMap<>();
        for(int i : arr)
        {
            if(d.containsKey(i))
            {
                System.out.print("duplicate" + i);
                break;
            }
            else
            {
                d.put(i, 1);
            }
        }
   }

}
