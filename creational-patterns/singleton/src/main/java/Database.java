public class Database {
    private static volatile Database database;
    private Database() {
    }

    public static Database getInstance() {
        if (database == null) {
            synchronized (Database.class) {
                if (database == null) {
                    Database.database = new Database();
                }
            }
        }
        return database;
    }
}
