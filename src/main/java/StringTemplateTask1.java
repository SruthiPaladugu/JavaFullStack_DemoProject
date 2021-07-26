import java.util.*;
import org.stringtemplate.v4.*;

public class StringTemplateTask1 {

    public static void main(String[] args){


        //Task-1//


        List<String> Dept = new ArrayList<String>();
        Dept.add("cse");
        Dept.add("ece");
        Dept.add("eee");
        Dept.add("civ");


        STGroupFile stg = new STGroupFile("C:\\Users\\sp1610\\Desktop\\Assessments\\Help\\SecondTemplate.stg",'$','$');
        stg.registerRenderer(String.class, new StringRenderer());

        ST template1 = stg.getInstanceOf("template1");
        template1.add("myList", Dept);
        System.out.println("Select emp_id,emp_name from Employees where dept in " + template1.render());

        //Task-3//

        Map<Object,Object> myMap = new HashMap<Object, Object>();
        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("key1","val1");
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        myMap.put("iam_an_integer",1);
        myMap.put("iam_a_map",map1);
        myMap.put("iam_a_list",list1);

        ST template2 = stg.getInstanceOf("template2");
        template2.add("myMap", myMap);
        System.out.println(template2.render());










    }

}
