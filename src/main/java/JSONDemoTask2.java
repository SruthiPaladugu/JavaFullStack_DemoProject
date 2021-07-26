
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class JSONDemoTask2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\sp1610\\Desktop\\Assessments\\src\\main\\java\\example.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("name:" +jsonObject.get("name"));
            System.out.println("age:" +jsonObject.get("age"));
            System.out.println("car:" +jsonObject.get("car"));
            JSONArray companyList = (JSONArray) jsonObject.get("Major");
            Iterator<JSONObject> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}