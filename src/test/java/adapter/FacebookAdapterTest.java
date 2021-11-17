package adapter;

import facebook.FacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FacebookAdapterTest {
    private FacebookAdapter adaptedUser;
    private FacebookUser normalUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        normalUser = new FacebookUser("seva.archakov@gmail.com", "Ukraine", new Date());
        adaptedUser = new FacebookAdapter(normalUser);
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(normalUser.getEmail(), adaptedUser.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(normalUser.getUserCountry(), adaptedUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getTime() {
        assertEquals(normalUser.getUserActiveTime(), adaptedUser.getTime());
    }
}