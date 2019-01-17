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
public class TCPChatServer {

	public static void main(String[] args)throws Exception {
		
		System.out.println("Server is Started....");
		Scanner inp=new Scanner(System.in);
		
		ServerSocket sc= new ServerSocket(9995);
		
		System.out.println("Waitting for client to connect......");
		
		Socket scc=sc.accept();
		
		InputStreamReader in= new InputStreamReader(scc.getInputStream());
		BufferedReader input=new BufferedReader(in);
		
		
		OutputStreamWriter op=new OutputStreamWriter(scc.getOutputStream());
		PrintWriter output=new PrintWriter(op);
		
		while(true)
		{
			String clientmsg= input.readLine();
			System.out.println("Message from Client:"+clientmsg );
			System.out.println("Server:");
			String servermsg=inp.nextLine();
			
			
			output.println(servermsg);
			output.flush();
			if(servermsg.equals("bye"))
			{
				System.out.println("Server is Disconnected.. ");
				//output.flush();
				break;
			}
		}
       scc.close();	
	}

}
