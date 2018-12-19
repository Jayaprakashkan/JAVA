
/**
 *  MapImplimentation here.
 * 
 * @author K.JAYAPRAKASH 
 * 
 **/
import java.util.*;
import java.io.*;

public class MapImplimentation {
 
    public static void main(String [] args)
    {
        HashMap map=new HashMap();   //create the hash map object
        boolean con=true;
        Scanner in=new Scanner(System.in);

        while(con==true){                                                  //Continue till no more Fishes in tank
                   System.out.println("Enter the Color Of the Fish:");
                   String col=in.next();                                   //Get the Fish color from user
                   if(!(map.containsKey(new String(col))))                 //If that color Not present in the list add first fish
                   {
                   map.put(new String(col),new Integer(1));            
                    }
                    else
                    {
                    int val=((Integer)map.get(new String(col)));
                    map.put(new String(col),new Integer(val+1));           //if already exist then take the old value add one with that
                    }
                  System.out.println("Enter false for no more Fishes, or Enter true");
                  con=in.nextBoolean();
        }
        
       System.out.println(map);                        //print the Color And No.of Fishes as pairs
    }
}
