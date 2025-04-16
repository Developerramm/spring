import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String url =
            "jdbc:mysql://localhost:3306/spark";
    private static final String username = "root";
    private static final String password = "ramkumar";


    public static Connection getConnection(){
        Connection conn = null;
        try{
            //Register the JDBC driver
            Class.forName(Driver);

            //Open the connection
            conn = DriverManager.
                    getConnection(url, username, password);

            if(conn != null){
                System.out.println("Successfully connected.");
            }else{
                System.out.println("Failed to connect.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }

}
