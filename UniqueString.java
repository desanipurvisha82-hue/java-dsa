import java.util.*;
public class UniqueString {
   public static void main(String[] args) {
        String[] words = {
    "java",
    "python",
    "java",
    "c++",
    "python",
    "java"
};

HashMap<String, Integer> u = new HashMap<>();

for(String s : words)
{
    if(u.containsKey(s))
    {
        u.put(s, u.get(s) + 1);
    }
    else
    {
        u.put(s, 1);
    }
}

for(Map.Entry<String , Integer> entry: u.entrySet())
{
    if(entry.getValue()==1)
    {
        System.out.println(entry.getKey());
    }
}
   }


}
