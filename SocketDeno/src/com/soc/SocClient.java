package com.soc;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient {

	public static void main(String[] args) throws Exception 
	{
		String ip = "localhost";
		int port = 9999;//0 to 65535 and 0-1023 are reserved port number ex port number of tomcat 8080 ang mysql is 3306
	
		
		Socket s = new Socket(ip,port); //mention ip address and port number
         // by doing this we are connected to server side
	
	      String str = "Abhishek Bajpai"; // i want is that when i send a request to server what i want is abh from server to the client side
	         OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
	         PrintWriter out = new PrintWriter(os);
	         out.println(str);
	         os.flush();// we are forcefully sendind data coz buffer has a memory of 512 bytes
	         // OutputStreamWriter is used to convert data into stream format
	         //s.getOutputStream() it means we want to send data to socket
	         BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	     	String nickname = br.readLine();
	         // for fetching data from the server
	     	
	     	System.out.println("C: DATA SENT FROM THE SERVER TO CLIENT" +  nickname);
	        
	         
	         
	         
	         
	}
	


}
