import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class postRequest {
    public static void Login(){
        String requestBody = "{\"name\": \"Example\", \"password\": \"34lkejt9eoi5uteir\", \"email\": \"loveyoupal16@gmail.com\"}";

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(URI.create("http://localhost:5000/api/v1/register"))
                .header("Content-Type", "application/json")
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
