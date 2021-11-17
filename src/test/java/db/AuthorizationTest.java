package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Database db;
    Authorization auth;

    @BeforeEach
    void setUp() {
        db = new Database();
        auth = new Authorization();
    }

    @Test
    void authorize() {
        assertTrue(auth.authorize(db));
    }
}