import db.Authorization;
import db.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization auth = new Authorization();
        if (auth.authorize(db)) {
            db.ReportBuilder br = new db.ReportBuilder(db);
        }
    }
}
