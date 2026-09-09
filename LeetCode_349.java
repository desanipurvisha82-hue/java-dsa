import java.util.*;
public class LeetCode_349 {
    public static void main(String args[])
    {
        int arr1[] = {2,3,4,5,6};
        int arr2[]={2,3,0,1,7};

        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        
        for(int i : arr1)
        {
            set.add(i);
        }
        for(int c : arr2)
        {
            if(set.contains(c))
            {
                 result.add(c);
            }
        }
System.out.println(result);
    }
    
}


// import java.util.*;

// class Solution { 
//     public int[] intersection(int[] nums1, int[] nums2) { 
        
//         HashSet<Integer> set = new HashSet<>();
//         HashSet<Integer> result = new HashSet<>();
        
//         for(int i : nums1) {
//             set.add(i);
//         }

//         for(int c : nums2) {
//             if(set.contains(c)) {
//                 result.add(c);
//             }
//         }

//         int[] answer = new int[result.size()];
//         int i = 0;

//         for(int x : result) {
//             answer[i] = x;
//             i++;
//         }

//         return answer;
//     } 
// }