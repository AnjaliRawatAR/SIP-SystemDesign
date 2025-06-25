package D;

public class Database_Client {
    public static void main(String[] args) {
//        SQL_Database sql = new SQL_Database();
//        NoSQL_Database nsql = new NoSQL_Database();
        Database d1 = new SQL_Database();
        DBA dSql = new DBA(d1);

        Database d2 = new NoSQL_Database();
        DBA dNoSql = new DBA(d2);
    }

    //here dependency concrete class ki jagah parent class par chali gayi hai
    // that is jisko jo use vo implement karo;
}

