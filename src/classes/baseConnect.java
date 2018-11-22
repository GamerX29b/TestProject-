package classes;
import java.sql.*;

public class baseConnect {
/*
 public static void main (String args[]) {
    int code = 0;
    code = TestClass.InsertDBO(5,"Petr","Petrov","Petrovich");
    System.out.println(code);
}

public static class TestClass { */


    public static int InsertDBO (int id, String name, String surname, String patronymic){
        int code = 0;

        String Inserts = " ";

        try {
            Class.forName ("org.h2.Driver");
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }

        try(
                Connection conn = DriverManager.getConnection("jdbc:h2:~/Base;", "sa", "");
                Statement stmt = conn.createStatement();
        ) {
            /*Inserts = "CREATE TABLE Full_info (info_id int NOT NULL, name varchar(40), surname varchar(40), " +
                    "patronymic varchar(40), PRIMARY KEY (info_id));";
            System.out.println(Inserts);
            stmt.executeUpdate(Inserts); */

            Inserts = ("INSERT INTO Full_info (INFO_ID, NAME, SURNAME, PATRONYMIC ) " +
                    " VALUES ( " + id + ", '" + name + "', '" + surname + "', '" + patronymic + "');");
            stmt.executeUpdate(Inserts);

            conn.commit();
            conn.close();
            code = 1;

        } catch (SQLException sqle) {
            System.out.println(sqle);
            code = 0;
        }

        return (code);
   // }
       /* public static int PullDBO {

        }*/
}
}

