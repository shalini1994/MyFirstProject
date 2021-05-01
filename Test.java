import java.util.Arrays;
import java.util.List;
public class Test {
	
   static class Animal {
   }

   static class Dog extends Animal {
   }
	
	
    static List<Dog> getMyAnimals() 
	{
       List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
       return dogs;
   }
   public static void main(String args[]){
	
	   
	   List<Dog> dogs = getMyAnimals();
	   System.out.println(dogs);
   }
} 
