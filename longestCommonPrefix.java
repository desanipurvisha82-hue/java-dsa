import java.util.*;
public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"flower","flow","flight"};
        String result="";
        

        for(int i =0;i<str[0].length();i++)
        {boolean match = true ;
            char current =  str[0].charAt(i);
        for (int j = 0; j < str.length; j++) {

    if (i >= str[j].length() || str[j].charAt(i) != current) {
        match = false;
        break;
    }
}
              if (match) {
        result += current;
    } else {
        break;
    }
            

         }
      System.out.println(result);  
    }


}
