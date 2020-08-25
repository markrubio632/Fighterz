package com.chat;

import java.util.HashSet;
import java.util.Set;

public class ChatServer {
	
	private int port;
	private Set<String> userName = new HashSet<>();
	//private Set<UserThread> userThreads = new HashSet<>();
	
	public ChatServer(int port) {
        this.port = port;
    }
 
}
