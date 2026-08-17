import java.util.*;

public class TwoSumH {
    public static void main(String[] args) {

        int arr[] = {2, 5, 7, 8, 9, 1};
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                System.out.println("Indexes: " + map.get(needed) + ", " + i);
                return;
            }

            map.put(arr[i], i);
        }
    }
}