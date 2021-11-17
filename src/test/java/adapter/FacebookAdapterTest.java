package adapter;

import facebook.FacebookUser;

import static org.junit.jupiter.api.Assertions.*;

class FacebookAdapterTest {
    private FacebookAdapter adapted;
    private FacebookUser normalUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        adapted = new FacebookAdapter(normalUser);
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(normalUser.getEmail(), adapted.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
    }

    @org.junit.jupiter.api.Test
    void getTime() {
    }
}