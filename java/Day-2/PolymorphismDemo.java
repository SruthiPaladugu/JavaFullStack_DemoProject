import java.util.Scanner; 

 //Implementing Polymorphism
 
class Animal{
     String Shout()
     {
        String str = "Shouts";
        return str;
     }
    }
     
class Dog extends Animal
{
   String Shout()
   {
       String str = "Bow Bow..";
       return str;
   }
}
class Cat extends Animal
{
    String Shout()
    {
        String str = "Meow Meow..";
        return str;
    }
}
class Lion extends Animal
{
    String Shout()
    {
        String str = "Roar Roar..";
        return str;
    }
}

class PolymorphismDemo{
    public static void main(String args[])
    {
        Animal a;
        a = new Lion();
        System.out.println(a.Shout());
        a = new Dog();
        System.out.println(a.Shout());
    }
}
