
import org.stringtemplate.v4.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringTemplateDemo2 {
    public static void main(String[] args) {
        //HashMap1 - hashMap1

        Map<Integer, String> hashMap1 = new HashMap<Integer,String>();
        hashMap1.put(1, "Apple");
        hashMap1.put(2, "Mango");
        hashMap1.put(3, "Orange");
        hashMap1.put(4, "PineApple");
        hashMap1.put(5, "WaterMelon");

        //HashMap2 - hashMap2

        Map<Integer, String> hashMap2 = new HashMap<Integer,String>();
        hashMap2.put(11, "Elephant");
        hashMap2.put(12, "Dog");
        hashMap2.put(13, "Lion");
        hashMap2.put(14, "Tiger");
        hashMap2.put(15, "Cheetah");

        //HashMap3 - hashMap3

        Map<Integer, String> hashMap3 = new HashMap<Integer,String >();
        hashMap3.put(50, "Apple");
        hashMap3.put(51, "Carrot");
        hashMap3.put(52, "Kangaroo");
        hashMap3.put(53, "Yellow");
        hashMap3.put(54, "Dog");

        //Adding map as an element in the list

        List<Map<Integer, String>> myList1= new ArrayList<Map<Integer, String>>();
        myList1.add(hashMap1);
        myList1.add(hashMap2);
        myList1.add(hashMap3);

        STGroupFile stGroupFile = new STGroupFile("C:\\Users\\sp1610\\Desktop\\Assessments\\Help\\my_template.stg",'$','$');
        stGroupFile.registerRenderer(String.class, new StringRenderer());

        ST template5 = stGroupFile.getInstanceOf("template5");
        template5.add("myList", myList1);
        System.out.println(template5.render());


    }

}
