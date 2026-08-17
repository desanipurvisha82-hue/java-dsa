import java.util.*;

public class majorityElement {
    public static void main(String[] args) {

        int arr[] = {4, 5, 7, 7, 9, 1, 1, 1, 1,1,1,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > arr.length / 2) {
                System.out.println(num);
                break;
            }
        }
    }
}