import java.util.*;

class TwoShortArrayMedian
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;

        System.out.println("Enter The Value of n");
        n = sc.nextInt();

        System.out.println("Enter The Value of m");
        m = sc.nextInt();

        int num1[] = new int[n];
        int num2[] = new int[m];

        System.out.println("Enter The Elements Of First Array 1");
        for (int i = 0; i < num1.length; i++)
        {
            num1[i] = sc.nextInt();
        }

        System.out.println("Enter The Elements Of Second Array");
        for (int i = 0; i < num2.length; i++)
        {
            num2[i] = sc.nextInt();
        }

        double ans = findMedianSortedArrays(num1, num2);
        System.out.println("Median Is " + ans);
    }

    public static double findMedianSortedArrays(int[] num1, int[] num2)
    {
        double median;

        int[] merged = new int[num1.length + num2.length];

        for (int i = 0; i < num1.length; i++)
        {
            merged[i] = num1[i];
        }

        for (int i = 0; i < num2.length; i++)
        {
            merged[num1.length + i] = num2[i];
        }

        

       for (int i = 0; i < merged.length - 1; i++) {
    for (int j = 0; j < merged.length - 1 - i; j++) {
        if (merged[j] > merged[j + 1]) {
            int temp = merged[j];
            merged[j] = merged[j + 1];
            merged[j + 1] = temp;
        }
    }
}//also can use array.sort();
 System.out.print(" Shorted array " );
        for (int a = 0; a <= merged.length-1; a++)
        {
            System.out.print(merged[a] + " ");
        }

        int total =  num1.length+num2.length;
   if (total % 2 == 1) {
    median = merged[total / 2];
} else {
    median = (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
}

        return median;
    }
}


// import java.util.*;

// class Solution {

//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {

//         int[] merged = new int[nums1.length + nums2.length];

//         // Copy first array
//         for (int i = 0; i < nums1.length; i++) {
//             merged[i] = nums1[i];
//         }

//         // Copy second array
//         for (int i = 0; i < nums2.length; i++) {
//             merged[nums1.length + i] = nums2[i];
//         }

//         // Sort the merged array
//         Arrays.sort(merged);

//         int total = merged.length;

//         if (total % 2 == 1) {
//             return merged[total / 2];
//         } else {
//             return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
//         }
//     }
// }