
/**
 * Implimentation Of STACK
 * 
 * @author K.JAYAPRAKASH 
 * 
 */
import java.util.*;
public class MainCall {
    public static void main(String [] args){
        Stack ne=new Stack();
        int e=0,r=0;
        int choice=0;
         Scanner in=new Scanner(System.in);
         do{
        System.out.println("Enter your Choice:\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
         choice=in.nextInt();
        
            switch(choice){
                 case 1:
                      System.out.println("Enter the data which you want to push");
                       e=in.nextInt();
                       ne.Push(e);
                       break;
                 case 2:
                      ne.Pop();
                      break;
                 case 3:
                      ne.Peek();
                      break;
                 case 4:
                      ne.Display();
                      break;
                 default:
                      System.out.println("Enter the Valid data");
          
                    }
        }while(choice!=5);
        
    }
}
 class Stack{
    int top=-1,w=0;
    Scanner t=new Scanner(System.in);
   // System.out.println("Enter the Size of the Stack");
    int n=t.nextInt();
    int [] st=new int[n];
    public void Push(int data){
        if(top==(n-1)){
            System.out.println("Stack is Overload");
        }
        else{
            top++;
        st[top]=data;
        System.out.println(st[top]+" is Pussed Successfully");
        //top++;
    }
    }
    public void Pop(){
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            w=st[top];
            top--;
             System.out.println(w+" is Poped Succesfully");
                    }
           
    }
    
    public void Peek(){
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            //return 0;
        }
        else
        {
            w=st[top];
            
            System.out.println(w+" is Peeked Succesfully");
             }
     }
            
    
    public void Display(){
        if(top==-1)
        {
            System.out.println("Stack is Empty");
           
        }
        else
        {
                  for(int i=0;i<=top;i++)
                    {
                     System.out.println(st[i]+" ");
                    }
         }
  
    }
    }
