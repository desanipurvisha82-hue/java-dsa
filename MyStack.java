public class MyStack {
    int[] arr ;
    int top;
    MyStack(int size)
    {
         arr = new int[size];
         top = -1;
    }
    
    void push(int value)
    {
        if(top == arr.length-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = value;
    }

    int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }
    int peek()
    {
        if(top==-1)
        {
            return -1;
        }
        return arr[top];
    }
    boolean ismpty()
    {
    return top==-1;
    }

    public static void main(String[] args) {
        MyStack s = new MyStack(10);
        s.push(20);
         s.push(10);
          s.push(30);
           s.push(50);
            s.push(20);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
   
}
