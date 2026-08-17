import java.util.*;
public class ContainerWithMostWater {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int hight[] = {1,8,6,2,5,4,8,3,7};
        int width;
        int l = 0;
        int r = hight.length-1;
        int maxsum = 0;
        int temp;

     while (l < r) {

    int sum = Math.min(hight[l], hight[r]) * (r - l);

    if (sum > maxsum) {
        maxsum = sum;
    }

    if (hight[l] < hight[r]) {
        l++;
    } else {
        r--;
    }
}

        System.out.println(maxsum);


    
    }
}
