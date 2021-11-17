package db;


public class Authorization {
    private Авторизація auth;

    public Authorization() {
        auth = new Авторизація();
    }

    public Authorization(Авторизація auth) {
        this.auth = auth;
    }

    public boolean authorize(Database db) {
        return auth.авторизуватися(db.getDb());
    }
}
