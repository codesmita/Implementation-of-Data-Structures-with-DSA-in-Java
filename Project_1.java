class Node<T> 
{
    T data;
    Node<T> next;

    public Node(T data) 
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList<T> 
{
    private Node<T> head;

    public LinkedList() 
    {
        this.head = null;
    }
    public void insertAtBeginning(T data)
    {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(T data) 
    {
        Node<T> newNode = new Node<>(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
    }
    public void display() 
    {
        Node<T> current = head;
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Project_1
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        
        list.insertAtBeginning(0);
        
        list.display(); 
    }
}