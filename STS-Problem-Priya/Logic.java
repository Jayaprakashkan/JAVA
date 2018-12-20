
import java.util.*;
import java.io.*;
public class Logic {
       
        public static void main(String [] args)
        {
           Scanner in=new Scanner(System.in);
           
           int n=in.nextInt();
           int i=0,k=1;
           int last=(int)Math.pow(n,2)+n;
           ArrayList<Integer> arr=new ArrayList<Integer>();
           
           for(i=1;i<=last;i++)
           {
            arr.add(i);
            }
            
           while(n>=1)
           {
            int s=arr.size()-n;
            
            int l=arr.size();
            for(i=0;i<n;i++)
            {
                System.out.print(arr.get(0)+" ");
                arr.remove(0);
            }
           
            for(i=s;i<l;i++)
            {
                 System.out.print(arr.get(l-(2*n))+" ");
                 arr.remove(l-(2*n));
            }
            System.out.print("\n");
            n=n-1;
            
            }
          
        }
}
