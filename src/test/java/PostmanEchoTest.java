import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
public class PostmanEchoTest {
    @Test
    void shouldReturnSendData() {
        String text = "Hello";
        given()
                .baseUri("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Hi"));
    }
}