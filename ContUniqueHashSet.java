import java.util.*;
public class ContUniqueHashSet {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,1,6,7,8,8};
    HashSet<Integer> u = new HashSet<>();
    for(int i : arr)
    {
       u.add(i);
    }
    System.out.println(u.size());
    }
}
