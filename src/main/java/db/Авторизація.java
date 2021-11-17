package db;

public class Авторизація {
    public boolean авторизуватися(db.БазаДаних db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
