import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class JSONDemo {

        public static void main(String[] args)
        {
            SortedMap<String, String> elements = new TreeMap();
            elements.put("Key1", "Value1");
            elements.put("Key2", "Value2");
            elements.put("Key3", "Value3");

            Gson gson = new Gson();
            Type gsonType = new TypeToken<HashMap>() {
            }.getType();
            String gsonString = gson.toJson(elements, gsonType);
            System.out.println(gsonString);
        }
}
