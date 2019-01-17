/* 
 * Networking - TCP Peer to Peer Chatting
 * JAYAPRAKASH
 * InputStreamReeader and OutputStreamWriter
 * Two way Communication - client output stream is input stream of the server 
 *                         server output stream input of the client
 */
import java.io.* ; // Input and Output Stream
import java.net.*; // Network Folder
import java.util.*;   
public class TCPChat {

	public static void main(String[] args) throws Exception
	{
		Scanner inp = new Scanner(System.in);
		InetAddress ip = InetAddress.getLocalHost();   //Local Host IP Address 
		
		Socket sc=new Socket(ip,9995);   //socket on port no 9995
		OutputStreamWriter op= new OutputStreamWriter(sc.getOutputStream());  //Output Stram for sedning
		PrintWriter ou=new PrintWriter(op);                   
		InputStreamReader in=new InputStreamReader(sc.getInputStream());  //Input Stream for receiving 
		BufferedReader bf=new BufferedReader(in);
		while(true)
		{
			System.out.println("Client:");
			String clientmsg=inp.nextLine();
			
			ou.println(clientmsg);
			ou.flush();
			
			
			String servermsg=bf.readLine();
			System.out.println("Server Replied:"+servermsg);
			if(clientmsg.equals("bye"))
			{
				System.out.println("Client Disconnected...:");
				break;
				
			}	
		}
          sc.close();
	}

}
