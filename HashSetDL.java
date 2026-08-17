import java.util.*;
public class HashSetDL {
   public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
    HashSet<Integer> d = new HashSet<>();

    boolean duplicate = false;

for(int i : arr)
{
    if(d.contains(i))
    {
        duplicate = true;
        break;
    }
    else
    {
        d.add(i);
    }
}

System.out.println(duplicate);
   }

}
