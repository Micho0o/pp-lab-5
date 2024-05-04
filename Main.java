import Company.Exceptions.InvalidAgeException;
import Company.Implementations.EmailMessenger;
import Company.Interfaces.Messenger;
import Company.Beans.Person;
import Company.Utils.MathUtils;

public class Main 
{

    public static void main(String[] args)
    {
     Person[] people = new Person[5];
        
     final int b = 10;

     try 
     {
         people[0] = new Person("John Doe", 30);
         people[1] = new Person("Krystian Dda", 55);
         people[2] = new Person("Bartek Kowalski", 11);
         people[3] = new Person("EMil Dudek", 23);
         people[4] = new Person("Michał Lipski", 87);

         for (Person person : people) 
         {
             int result = MathUtils.add(person.getAge(), b);
             System.out.println("Imie " + person.getName() + " Wiek: " + result);

             Messenger messenger = new EmailMessenger();
             messenger.sendMessage(person.getName() + ". Jego wiek wyslany mailem " + result);
         }
     } catch (InvalidAgeException e) 
     {
         System.out.println(e.getMessage());
     }
    }
}
