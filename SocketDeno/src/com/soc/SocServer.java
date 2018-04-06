package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

	public static void main(String[] args) throws Exception
	{
		System.out.println("S: SERVER IS STARTED");
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("SERVER IS WAITING FOR CLIENT REQUEST");
		
	Socket s = ss.accept(); //this will create new socket for me and it is creating because we are sending request from the client side
	System.out.println("S: CLIENT CONNECTED");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	String str = br.readLine();//we are reading data from the client side
	System.out.println("S: client Data:" + str);
	
	//buffered reader is used to read data from client side
	 String nickname = str.substring(0, 3);
	 
	 OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
     PrintWriter out = new PrintWriter(os);
     out.println(nickname);
     
     out.flush(); //it will forcefully send the data to the client side
	System.out.println("S: DATA SEND FROM SERVER TO THE CLIENT");
	
	
	}

}
