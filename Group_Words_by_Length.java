
import java.util.ArrayList;
import java.util.HashMap;


public class Group_Words_by_Length
{

    public static void main(String[] args) {
        String[] words = {"cat","dog","apple","bat","hello","hi"};


        HashMap<Integer , ArrayList<String>> l = new HashMap<>();
        for(String s : words)
        {
            int length  =  s.length();
            
            if(l.containsKey(length))
            { ArrayList<String> existingList = l.get(length);
                existingList.add(s);

            }
             else
            {

                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                l.put(length, list);
            }

        }

        System.out.println(l);

    }

}