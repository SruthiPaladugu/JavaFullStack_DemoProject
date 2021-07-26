import java.util.Scanner;

public class ExerciseOne{
    public static void main(String args[]){
        
        //Conditional statements, Loops, Variables, Arrays

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to know the day of week");
        int a = sc.nextInt();
        System.out.println("Please Enter You Name:");
        String name = sc.next();
        int sum=0;
        int[] arr = new int[4];        
            if(a==0)
            {
                System.out.println("Invalid Input");
            }
            else
            {
                switch (a) {
                    case 1: System.out.println("Hi, It's Sunday. Welcome  " +name);                    
                        break;
                    case 2: System.out.println("Hi, It's Monday. Welcome " +name); 
                        break;
                    case 3: System.out.println("Hi, It's Tuesday. Welcome " +name);
                        break;
                    case 4: System.out.println("Hi, It's Wednesday. Welcome " +name);
                        break;
                    case 5: System.out.println("Hi, It's Thursday. Welcome " +name);
                        break;
                    case 6: System.out.println("Hi, It's Friday. Welcome " +name);
                        break;
                    case 7: System.out.println("Hi, It's Saturday. Welcome " +name);
                        break;
                    default: System.out.println("Enter a number between 1-7.." +name);
                        break;
                }
            }        

        System.out.println("Enter your marks for 4 Subjects..");
        for(int i=0;i<4;i++)
        {
            arr[i] = sc.nextInt(); 
            sum=sum+arr[i];                       
        }
        System.out.println("Average is "+sum/4);
        
    }        
    
}