import java.sql.*;

public class InsertStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "ramkumar";

        String query = "insert into students(name,age,course)values(?,?,?);";
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            PreparedStatement pr = conn.prepareStatement(query);
            pr.setString(1,"Sarita");
            pr.setInt(2,24);
            pr.setString(3,"Node.Js");
            pr.executeUpdate();
            System.out.println("Data Inserted successfully");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
