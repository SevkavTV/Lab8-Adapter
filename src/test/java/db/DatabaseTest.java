package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database db;

    @BeforeEach
    void setUp() {
        db = new Database();
    }

    @Test
    void getUserData() {
        assertEquals(db.getUserData(), "hello");
    }

    @Test
    void getStatData() {
        assertEquals(db.getStatData(), "hello2");
    }
}