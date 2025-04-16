import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = DBConnection.getConnection();
            System.out.println("Connection created successfully");
        } catch (Exception e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}