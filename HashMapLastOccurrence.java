import java.util.*;
public class HashMapLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {2,6,7,9,1,0,1,2,3 ,2};
        HashMap<Integer, Integer> LasttIndex = new HashMap<>();
        for(int i = 0; i<arr.length;i++)
        {
            
            LasttIndex.put(arr[i] , i);
        }
        System.out.println(LasttIndex);
    }
}
