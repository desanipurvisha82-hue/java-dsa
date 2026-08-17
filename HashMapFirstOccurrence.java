import java.util.*;
public class HashMapFirstOccurrence
{
    public static void main(String[] args) {
        int arr[] = {2,6,7,9,1,0,1,2,3};
        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        for(int i = 0; i<arr.length;i++)
        {
            if(!firstIndex.containsKey(arr[i]))
            {

            }
            firstIndex.put(arr[i] , i);
        }
        System.out.println(firstIndex);
    }
}