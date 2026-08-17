import java.util.*;

public class HashSetRemove {
    public static void main(String[] args) {
        int arr[] = {1,2,1,4,4,7,8,0,1};
        HashSet <Integer> set = new HashSet<>();

        for(int i : arr)
        {
            if(set.contains(i))
            {
                System.out.println(i + "Duplicate Value");
                
            }
            set.add(i);
        }
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
