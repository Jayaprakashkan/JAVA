
import java.util.*;

 class DoublyLinkedList<E> {
    
    Node<E> head;
    Node<E> tail;
    
    public void insertAtStart(E data)
    {   
        
        if(head==null)
        {
           Node<E> n=new Node<E>();
           n.data=data;
           n.next=null;
           n.prev=null;  
           head=n;
           tail=n;
        }
        
        else
        {
           Node<E> n=new Node<E>();
           n.data=data;
           n.prev=null;
           n.next=head;
           head.prev=n;
           head=n;
        }
    }
        
    public void displayFromFirst()
     {
        Node<E> n=head;
         while(n!=null)
         {
             System.out.println(n.data);
             n=n.next;
            } 
      }
    public void displayFromLast()
     {
        Node<E> n=tail;
         while(n!=null)
         {
             System.out.println(n.data);
             n=n.prev;
            } 
      } 
      
    public void insertAtmiddle(E data,int index)
    {
       if(index==0)
       {
        insertAtStart(data);
        }
        
       else
        {    
         
             Node<E> n=head;
             for(int i=1;i<index-1;i++)
             {
                n=n.next;
                
             }
             Node<E> n1=n.next;
             Node<E> newnode=new Node<E>();
             newnode.data=data;
             newnode.next=n1;
             newnode.prev=n;
             n.next=newnode;
             n1.prev=newnode;
             
          }
    }
    
    public void insertatLast(E data)
    {
         Node<E> node=new Node<E> ();
         node.data=data;
         node.next=null;
         node.prev=tail;
         tail.next=node;
         tail=node;
    }
    
    public void  deleteAtFirst()
    {
      head=head.next;
      head.prev=null;
    }
    
    public void  deleteAtLast()
    {
      tail=tail.prev;
      tail.next=null;
    }
    
    public void deleteAtMiddle(int index)
    {
      Node<E> n=head;
      for(int i=1;i<index-1;i++)
      {
        n=n.next;
      }
      Node<E> temp1=n.next;
      Node<E> temp2=temp1.next;
      n.next=temp1.next;
      temp2.prev=n;
    }
    
    public void show3by3()
    {
     Node<E> n=head;
     Node<E> n1=head;
     Stack<E> st=new Stack<E>();
     int size=0;
     while(n1!=null)
     { 
         size++;
         n1=n1.next;
        }
         //System.out.print(size);
     for(int i=1;i<=size;i++)
     {
         st.push(n.data);
         if(i%3==0)
         { 
             for(int j=0;j<3;j++)
             {
                System.out.print(st.pop());
                }
             st.clear();
             System.out.print("-");
            }
          n=n.next;
        }
     while(!st.isEmpty())
     {
         System.out.print(st.pop());
        
        }
     
      System.out.print("  ");
    }
    
    
}
