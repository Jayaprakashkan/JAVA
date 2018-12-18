
/**
 * Implimentation Of Single Linked List
 * 
 * @author K.JAYAPRAKASH 
 * 
 */
public class List {
     
      Node head;
      
    public void Insert(int data){
         
         Node node=new Node();   //Creating Node 
         node.data=data;         // Assign value For new node
         
         if(head==null){
            head=node;            //this is the First Node
            }
          else{
            Node n=head;
            while(n.next!=null){     //traverse from head to index
                n=n.next; 
            }
            n.next=node;              //Assign this Object Addres to the 
            }                         // previous node.next
    
    }
    
    public void show(){
     Node nd=head;
     do{
        System.out.println(nd.data);    //traverse from head to last
        nd=nd.next;                     //and print
        }while(nd.next!=null);          //here last node has Null
        
       System.out.println(nd.data);          //Print the last node value
    }
    
    public void InsertAtStart(int data)   //Insert data At head
    {
        Node node=new Node();
        node.data=data;
        node.next=head;                 //new node next be a head
        head=node;                      //node will become a head
    }
    
    public void InsertAt(int index,int data)
    {  
        if(index==0){
        InsertAtStart(data);           
        }
        
        else{
       Node node=new Node();
       node.data=data;
       Node n=head;
       
       for(int i=0;i<index-1;i++)
       {
        n=n.next;
        }
        node.next=n.next;            //  assign the previous next to the new node next
        n.next=node;                 //previous next is a new node
    }
   }
   
   public void DeleteAt(int index)
   {
       if(index==0)
       {                            //delete head 
        head=head.next;             //Change head to the next node
        }                     
        
        else
        {
           Node n=head;
           for(int i=0;i<index-1;i++)       
           {
              n=n.next;
            }
           Node n1=n.next;                //this node will be delete
           n.next=n1.next;                //Change the next to previous node
           
        }
    }
}
