


public  class MyLinkedList
 {
    class Node
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data = data;
            this.next = null;
        }
       
    }
 Node head;

    void display()
    {
         Node current = head;
        while(current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

    void insertAtBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        {
            if(head == null)
            {
                head = newNode;
                return;
            }
            Node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    boolean search(int value)
    {
        Node current = head;
        while(current != null)
        {
           if(current.data ==  value)
           {
            return true;
           }
           current = current.next;
        }
        return false;
    }

    boolean deleteElement(int value)
    {
         Node previous = null;
        Node current = head;
        while(current!= null)
        {
            if(current.data == value)
            {
                if(previous == null)
                {
                    head =  current.next;
                }
                else
                {
                    previous.next = current.next;
                }
                return true;}
                previous = current;
                current = current.next;
            }
            return false;
        }

        
    public static void main(String [] args)
    {

    int arr[] = {8,1,2,3,4,5,1,0};
    MyLinkedList l = new MyLinkedList();
    for(int i :arr)
    {
        l.insertAtEnd(i);;
       
    }
    
     l.insertAtBeginning(7);
     l.deleteElement(8);

      l.display();


    }
    }


 
//     public class MyDoublyLinkedList {

//     class Node {
//         int data;
//         Node next;
//         Node prev;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     Node head;

//     // Display from beginning to end
//     void displayForward() {

//         Node current = head;

//         while (current != null) {
//             System.out.print(current.data + " ⇄ ");
//             current = current.next;
//         }

//         System.out.println("null");
//     }

//     // Insert at beginning
//     void insertAtBeginning(int data) {

//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head.prev = newNode;
//         head = newNode;
//     }

//     // Insert at end
//     void insertAtEnd(int data) {

//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node current = head;

//         while (current.next != null) {
//             current = current.next;
//         }

//         current.next = newNode;
//         newNode.prev = current;
//     }

//     // Search
//     boolean search(int value) {

//         Node current = head;

//         while (current != null) {

//             if (current.data == value) {
//                 return true;
//             }

//             current = current.next;
//         }

//         return false;
//     }

//     // Delete element
//     boolean deleteElement(int value) {

//         Node current = head;

//         while (current != null) {

//             if (current.data == value) {

//                 // Delete first node
//                 if (current.prev == null) {
//                     head = current.next;

//                     if (head != null) {
//                         head.prev = null;
//                     }
//                 }

//                 // Delete middle or last node
//                 else {
//                     current.prev.next = current.next;

//                     if (current.next != null) {
//                         current.next.prev = current.prev;
//                     }
//                 }

//                 return true;
//             }

//             current = current.next;
//         }

//         return false;
//     }

//     // Display from end to beginning
//     void displayBackward() {

//         if (head == null) {
//             System.out.println("null");
//             return;
//         }

//         Node current = head;

//         // Go to last node
//         while (current.next != null) {
//             current = current.next;
//         }

//         // Move backward
//         while (current != null) {
//             System.out.print(current.data + " ⇄ ");
//             current = current.prev;
//         }

//         System.out.println("null");
//     }

//     public static void main(String[] args) {

//         MyDoublyLinkedList list = new MyDoublyLinkedList();

//         int arr[] = {10, 20, 30, 40, 50};

//         for (int i : arr) {
//             list.insertAtEnd(i);
//         }

//         System.out.println("Forward:");
//         list.displayForward();

//         System.out.println("Backward:");
//         list.displayBackward();

//         list.insertAtBeginning(5);

//         System.out.println("After inserting 5:");
//         list.displayForward();

//         list.deleteElement(30);

//         System.out.println("After deleting 30:");
//         list.displayForward();

//         System.out.println("Search 40: " + list.search(40));
//     }
// }
