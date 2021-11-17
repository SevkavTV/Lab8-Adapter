package sender;

import adapter.User;

import java.util.Date;

public class MessageSender {
    public String send(String text, User user, String country) {
        Date currentDate = new Date();
        if(user.getTime() != null
                && (currentDate.getTime() - user.getTime().getTime()) < 86400000
                && country.equals(user.getCountry())){
            System.out.println("Message was sent!");
            return text;
        } else {
            System.out.println("User doesn't match criteria");
            return "";
        }
    }
}
