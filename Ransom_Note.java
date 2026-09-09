
import java.util.HashMap;

public class Ransom_Note {
    
    public static void main(String args[]){
        String ransomNote = "aaa";
        String  magazine = "aab";

        HashMap <Character , Integer> map = new HashMap<>();
        HashMap <Character , Integer> look = new HashMap<>();

        for(int i  = 0 ; i < magazine.length();i++)
        {
            char c = magazine.charAt(i);
  
            map.put(c, map.getOrDefault(c, 0) + 1);
            
        }System.out.println(map);

        for(int i = 0 ;i < ransomNote.length();i++)
        {
            char l = ransomNote.charAt(i);
            look.put(l, look.getOrDefault(l, 0) + 1);
        }
        System.out.println(look);

        for(char s : look.keySet())
        {
            if(map.getOrDefault(s, 0) < look.get(s))
            {
                System.out.println("False");
            }
            else
            {
                System.out.println("True");
            }
        }


    }

}
