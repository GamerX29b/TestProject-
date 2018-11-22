package classes;
import java.sql.*;

public class baseConnect {

public static void main (String args[]) {
    int code = 0;
    code = TestClass.InsertDBO(2,"Petr","Petrov","Petrovich");
    System.out.println(code);
}

public static class TestClass {


    public static int InsertDBO (int id, String name, String surname, String patronymic){
        int code = 0;
        Connection dbConnection = null;
        Statement statement = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:~/TestBase", "sa", "");

            String Inserts = ("INSERT INTO Full_info (INFO_ID, NAME, SURNAME, PATRONYMIC ) " +
                    " VALUES ( " + id + ", '" + name + "', '" + surname + "', '" + patronymic + "');");
            statement.execute(Inserts);

            conn.close();
            code = 1;

        } catch (SQLException sqle) {
            System.out.println(sqle);

            code = 0;
        }

        return (code);
    }
}
}

