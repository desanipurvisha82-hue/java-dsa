public class InsertionSort {
    public static void main(String[] args) {
        int arr[] =  {9,7,8,1,3,0};

        for(int i = 1 ; i < arr.length ; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j] ;
                j--;
            }
            arr[j+1] = key ; //j-- first happens so the values of j is changes 
        }
        
        
for(int i=0;i<arr.length;i++)
{
   System.out.println(arr[i] + "  ");
}
        
    }
}
