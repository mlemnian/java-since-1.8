package com.example.test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

    void newHttpClient() throws IOException, InterruptedException {
        // pre Java 11 you need a library e.g. Apache HttpClient, or OkHttp

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.cgi.com")).GET() // GET is default
                .build();

        // all requests are by default HTTP/2 and falls back to HTTP/1.1 if the receiver
        // is not HTTP/2 ready
        HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());

        System.out.println(response.statusCode());
    }

}
