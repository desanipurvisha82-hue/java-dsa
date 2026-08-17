public class BinarySearch {
   public static void main(String[] args) {
     int arr[] = {0, 1, 4, 5, 6, 7, 9};
    int key = 9;

    int l = 0 ;
    int h = arr.length -1;

    while(l<=h)
    {
       int  mid = (l+h)/2;
       if(arr[mid]==key)
       {
         System.out.println("Element found at  "+ mid);
         return;
       }
       if(arr[mid]<key)
       {
        l=mid+1;
       }
       else{
        h=mid-1;
       }

    }   
   }
}
