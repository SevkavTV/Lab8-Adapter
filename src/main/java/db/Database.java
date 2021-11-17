package db;

import lombok.Getter;

@Getter
public class Database {
    private БазаДаних db;

    public Database() {
        db = new БазаДаних();
    }

    public Database(БазаДаних db) {
        this.db = db;
    }

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStatData() {
        return db.отриматиСтатистичніДані();
    }

}
