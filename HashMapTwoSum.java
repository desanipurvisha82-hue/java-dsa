import java.util.*;
public class HashMapTwoSum {
    public static void main(String[] args) {
        int arr[] = { 6,7,2,1,9,1};
        int target = 10;
       HashMap<Integer , Integer> sum = new HashMap<>();
       for(int i = 0 ; i<arr.length;i++)
       {
        int needed =  target - arr[i];
       if(sum.containsKey(needed))
{
    int index = sum.get(needed);
    System.out.println(index + " " + i);
    break;
}
        sum.put(arr[i] , i);
       }

    }
}
