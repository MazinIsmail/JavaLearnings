package com.java9.http2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

/**
 * 
 * HTTP/2 Client
 * 
 * HTTP/2 client is one of the feature of JDK 9. HTTP/2 is the newest version of
 * the HTTP Protocol. By the help of HTTP/2 client, from the Java application,
 * we can send the HTTP request and we can process the HTTP response. Before JDK
 * 9, To send HTTP request and to process the HTTP response we are using
 * HttpURLConnection class.
 * 
 * Few major problems with HttpURLConnection:-
 * 
 * 1. HttpURLConnection class supports only HTTP/1.1 protocol but not HTTP/2.0
 * protocol. A protocol is nothing but a set of rules or procedures for
 * transmitting data between electronic devices, such as computers. HTTP stands
 * for HyperText Transfer Protocol and here Protocol stands for data
 * communication protocol used to establish communication between client and
 * server. As HttpURLConnection class only support HTTP/1.1 that’s why If we use
 * HttpURLConnection class then we can send only one request per TCP connection.
 * This will cause network traffic and performance issue for the application. As
 * HttpURLConnection supports only HTTP/1.1, It can process only text data not
 * the binary data.
 * 
 * 2. HttpURLConnection class only works in Synchronous mode. Synchronous mode
 * means we have to wait for the request to finish its task before sending
 * another request. If we use HttpURLConnection class to process HTTP requests
 * then we have to sit idle until we get the response of the request then we can
 * process another HTTP request, which will cause performance issue.
 * 
 * Advantages of HTTP/2.0 client:-
 * 
 * 1. HTTP/2.0 client is very lightweight and easy to use. HTTP/2.0 client
 * supports both HTTP/1.1 and HTTP/2.0 . HTTP/2 focuses on how data is framed
 * and transported between server and client. In HTTP/1.1, we cannot have more
 * than six connections open at a time, so every request has to wait for the
 * others to complete. The solution of the above problem is multiplexing in
 * HTTP/2 client. This means by the help of HTTP/2 can send multiple HTTP
 * requests in parallel over a single TCP connection.
 * 
 * 2. In HTTP/1.1, When we send one HTTP request which contains the header’s
 * information then HTTP/1.1 consider headers data as additional data, which
 * increases bandwidth. This can be eliminated in HTTP/2.0 by using HPack for
 * header compression.
 * 
 * 3. HTTP/2.0 client supports both Text and Binary data for processing.
 * 
 * 4. HTTP/2.0 client works in both Synchronous and Asynchronous mode. HTTP/2.0
 * client gives much better performance when compared with HttpURLConnection.
 */
public class Http2Learnings {
	public static void main(String[] args) throws IOException {

	}
}
