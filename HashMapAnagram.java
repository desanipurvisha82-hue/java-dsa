import java.util.*;

public class HashMapAnagram
{
    public static void main(String[] args) {

        String words[] = {"eat","tea","tan","ate","nat","bat"};

             HashMap<String, ArrayList<String>> ana = new HashMap<>();


        for(String s : words)
        {
            char c[] = s.toCharArray();

            Arrays.sort(c);

            String key = new String(c);

            if(ana.containsKey(key))
            {
                ArrayList<String> existingList = ana.get(key);
                existingList.add(s);
            }
            else
            {

                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                ana.put(key, list);
            }

        }
         System.out.println(ana);
    }
}