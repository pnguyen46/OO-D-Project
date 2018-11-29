import com.google.gson.Gson;

public class Json {
    public static String serialize(Places places){
        Gson gson = new Gson();
        return gson.toJson(places);
    }
}
