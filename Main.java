import Company.Exceptions.InvalidAgeException;
import Company.Implementations.EmailMessenger;
import Company.Interfaces.Messenger;
import Company.Beans.Person;
import Company.Utils.MathUtils;

public class Main 
{

    public static void main(String[] args) 
    {
        try 
        {
            Person person = new Person("Michał", 222);
            System.out.println("Imie " + person.getName());
            System.out.println("Wiek " + person.getAge());
        } 
        catch (InvalidAgeException e) 
        {
            System.out.println(e.getMessage());
        }

        int result = MathUtils.add(55, 555);
        System.out.println("Wynik dodawania " + result);
        
        Messenger Messenger = new EmailMessenger();
        Messenger.sendMessage("Wynik z dodawania wyslany mailem: " + result);
    }
}
