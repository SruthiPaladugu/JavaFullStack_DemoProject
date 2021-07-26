import java.io.*;
public class ExceptionHandlingDemo {

        public void Parent ()
        {
            child1();
        }


    void child1() throws ArithmeticException{
        int a = 50;
        int b=50/0;

        child2();
    }

    private void child2(){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }

    }

}
