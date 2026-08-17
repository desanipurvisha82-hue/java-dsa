import java.util.*;

class TwoSum {
    public static void main(String [] args) {
        System.out.println("Helllo world");
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
int n = sc.nextInt();

int[] arr = new int[n];
    
System.out.println("Enter The Value Of Target");
   int target =  sc.nextInt();
   System.out.println("target is :" + target);

    System.out.println("Hey Now Enter Elements array");
    for(int i =0 ; i<arr.length;i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("You Entered Following Elements ");
    System.out.println("You Entered Following Elements:");
for (int i = 0; i < arr.length; i++) {
    System.out.println("Index " + i + " : " + arr[i]);
}


  for(int i = 0;i<arr.length;i++)
  {
    for(int j = i+1; j<arr.length;j++)
    {
        if(arr[i]+arr[j]==target)
        {
            
            System.out.println("[" + i + ", " + j + "]");
            return;
        }
    }
  }
 System.out.println("No solution");
}
}