package Company.Implementations;

import Company.Interfaces.Messenger;

public class EmailMessenger implements Messenger {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
