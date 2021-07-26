
import org.stringtemplate.v4.*;
import java.util.*;

public class DemoOnStringtemplate {
    public static void main(String[] args){

        System.out.println("Welcome to StringTemplates");
        String name = "Sruthi";

        Map<String,String> map1 = new HashMap<String, String>();

        map1.put("animal","Dog");
        map1.put("plant","Rose");
        map1.put("colour","Yellow");
        map1.put("fruit","Apple");
        map1.put("vegetable","Carrot");

        STGroupFile stGroupFile = new STGroupFile("C:\\Users\\sp1610\\Desktop\\Assessments\\Help\\my_template.stg",'$','$');
        stGroupFile.registerRenderer(String.class, new StringRenderer());

        ST template1 = stGroupFile.getInstanceOf("template1");
        template1.add("data", name);
        System.out.println(template1.render());

        ST template3 = stGroupFile.getInstanceOf("template3");
        template3.add("myMap", map1);
        System.out.println(template3.render());

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Sam");
        list1.add("Mike");
        list1.add("Fred");
        list1.add("Rachel");
        list1.add("Richard");

        String template2 = "<list :{ items |<items :{ item |<item> }><\\n>}>";
        ST st = new ST( template2);
        st.add("list", list1);
        System.out.println(st.render());

        ST template4 = stGroupFile.getInstanceOf("template4");
        template4.add("list", list1);
        System.out.println(template4.render());


    }


}
