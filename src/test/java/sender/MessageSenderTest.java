package sender;

import adapter.FacebookAdapter;
import adapter.TwitterAdapter;
import adapter.User;
import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender messageSender;
    User user1;
    User user2;

    @BeforeEach
    void setUp() {
        messageSender = new MessageSender();

        FacebookUser facebookUser = new FacebookUser("seva.archakov@gmail.com", "Ukraine", new Date());
        TwitterUser twitterUser = new TwitterUser("seva.archakov@gmail.com", "Ukraine", new Date());

        user1 = new FacebookAdapter(facebookUser);
        user2 = new TwitterAdapter(twitterUser);
    }

    @Test
    void send() {
        assertEquals(messageSender.send("Hello", user1, "Ukraine"), "Hello");
        assertEquals(messageSender.send("Hello", user2, "Germany"), "");
    }
}