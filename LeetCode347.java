import java.util.*;
public class LeetCode347 {
public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,3,1,3,2};
int k = 2;
HashMap<Integer, Integer> Frequent = new HashMap<>();

for(int i: arr)
{
    if(Frequent.containsKey(i))
    {
        Frequent.put(i, Frequent.get(i)+1);
    }
    else
    {
        Frequent.put(i, 1);
    }
}
System.out.println(Frequent);


    Comparator<Map.Entry<Integer, Integer>> f =
    (entry1, entry2) ->
        Integer.compare(entry2.getValue(), entry1.getValue());

List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(Frequent.entrySet());
        list.sort(f);

       for(int i = 0; i < k; i++)
{
    System.out.println(list.get(i).getKey() );
} 

}
}
