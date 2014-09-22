// For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static dao.generated.Tables.*;
import static org.jooq.impl.DSL.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;

//        String userName = "root";
//        String password = "root";
//        String url = "jdbc:mysql://localhost:3306/library";

        try {
//            // For Mysql
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            conn = DriverManager.getConnection(url, userName, password);
            
            // For Sqlite
            Class.forName("org.sqlite.JDBC").newInstance();
            conn = DriverManager.getConnection("jdbc:sqlite:library.db");
            
//            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            DSLContext create = DSL.using(conn, SQLDialect.SQLITE);
            Result<Record> result = create.select().from(AUTHOR).fetch();
            
            System.out.println("Read from db:");
            for (Record r : result) {
                Integer id = r.getValue(AUTHOR.ID);
                String firstName = r.getValue(AUTHOR.FIRST_NAME);
                String lastName = r.getValue(AUTHOR.LAST_NAME);

                System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName);
            }
        } catch (Exception e) {
            // For the sake of this tutorial, let's keep exception handling simple
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }
}