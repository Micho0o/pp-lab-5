import Company.Exceptions.InvalidAgeException;
import Company.Implementations.EmailMessenger;
import Company.Interfaces.Messenger;
import Company.Beans.Person;

public class Main 
{

    public static void main(String[] args) 
    {
        try 
        {
            Person person = new Person("Michał", 22);
            System.out.println("Imie " + person.getName());
            System.out.println("Wiek " + person.getAge());
        } 
        catch (InvalidAgeException e) 
        {
            System.out.println(e.getMessage());
        }
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Jakiś email.");
    }
}
