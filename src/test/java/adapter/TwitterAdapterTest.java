package adapter;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TwitterAdapterTest {
    private TwitterAdapter adaptedUser;
    private TwitterUser normalUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        normalUser = new TwitterUser("seva.archakov@gmail.com", "Ukraine", new Date());
        adaptedUser = new TwitterAdapter(normalUser);
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(normalUser.getUserMail(), adaptedUser.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(normalUser.getCountry(), adaptedUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getTime() {
        assertEquals(normalUser.getLastActiveTime(), adaptedUser.getTime());
    }
}