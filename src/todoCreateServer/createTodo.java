package todoCreateServer;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class createTodo {
    public static void create(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE3MDQzNzAzNDEsImV4cCI6MTcwNDk3NTE0MX0.ms-hDrjMrSe8-aQ-ckKbehlirgJlAdE4RFdI5bMshwA";


        String requestBody = "{\"title\": \"Example\", \"description\": \"34lkejt9eoi5uteir\", \"priority\": \"green\", \"setTime\": \"3:4:2300\"}";

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(URI.create("http://localhost:5000/api/v1/todo-create"))
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .build();

        HttpResponse<String> response = null;
        try {

            response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException | InterruptedException e) {

            throw new RuntimeException(e);

        }

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
