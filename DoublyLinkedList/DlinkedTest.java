

public class DlinkedTest {

     public static void main(String args [])
     {
         DoublyLinkedList<Integer> obj=new DoublyLinkedList<Integer>();
         DoublyLinkedList<Character> obj1=new DoublyLinkedList<Character>();
         
         obj.insertAtStart(4);
         obj1.insertAtStart('A');
         obj.insertAtStart(3);
         obj1.insertAtStart('J');
         obj.insertAtStart(1);
         obj1.insertAtStart('K');
         obj1.insertAtStart('Y');
         obj.insertAtStart(3);
         obj1.insertAtStart('J');
         obj.insertAtStart(1);
         obj.insertAtmiddle(2,2);
         obj1.insertAtmiddle('A',2);
         obj.insertatLast(5);
         obj1.insertatLast('P');
         obj.deleteAtFirst();
         obj1.deleteAtFirst();
         obj.deleteAtLast();
         obj1.deleteAtLast();
         obj.deleteAtMiddle(2);
         obj1.deleteAtMiddle(2);
         
         obj.displayFromFirst();
         obj.displayFromLast();
         obj1.displayFromFirst();
         obj1.displayFromLast();
         obj.show3by3();
         obj1.show3by3();
       
         
        }
}
