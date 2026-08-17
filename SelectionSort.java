public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,7,9,1,6,5,0,2};

        for(int i = 0 ; i<=arr.length-1;i++)
        {
            int minIndex = i;
            for(int j = i+1; j<arr.length;j++)
            {
                if(arr[j] < arr[minIndex])

                    {
                        minIndex = j;
                    }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            
        
        }

        for(int i=0;i<arr.length;i++)
{
   System.out.println(arr[i] + "  ");
}
    }
}
