

import java.util.ArrayList;
import java.util.HashMap;

public class GroupOddEven {
    public static void main(String[] args) {
        int arr[] = {1,3,4,8};
        HashMap<String, ArrayList<Integer>> g = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
       
        for(int i : arr)
        {
            if(i%2==0)
            {
                if(g.containsKey("Even"))
                {
                  g.get("Even").add(i);
                }
                else
                {
                    
                 list.add(i);
    g.put("Even", list);
                }
            }

            
            else
{
    if(g.containsKey("Odd"))
    {
        g.get("Odd").add(i);
    }
    else
    {
        ArrayList<Integer> oddList = new ArrayList<>();
        oddList.add(i);
        g.put("Odd", oddList);
    }
}
        }
        System.out.println(g);

    }
    
}
