/**
 * Single Linked List.
 * 
 * @author (K.Jayaprakash) 
 * @version (a version number or a date)
 */
public class LinkedList {

     public static void main(String [] args){
        List ls=new List();
        ls.Insert(5);
        ls.Insert(3);
        ls.Insert(7);
        ls.Insert(10);
        ls.InsertAtStart(13);
        ls.InsertAtStart(12);
        ls.InsertAtStart(11);
        ls.InsertAt(2,90);
        ls.InsertAt(4,80);
        ls.InsertAt(0,29);
        ls.DeleteAt(0);
        ls.DeleteAt(3);
        ls.DeleteAt(5);
        ls.show();
        }
}
