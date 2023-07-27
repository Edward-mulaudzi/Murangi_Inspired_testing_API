import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;


public class APIService {
    public  static void postRequest(){
        String url="http://jsonplaceholder.typicode.com/posts";

        JSONObject body = new JSONObject();
        body.put( "PostId",1);
        body.put("Name","Murangi");
        body.put("Email","Murangi@gmail.com");
        body.put("body","27-07-2023");
        Response response = given().contentType("application/json").body(body.toJSONString()).post(url);
        response.then().statusCode(201).log().all();
    }
}
