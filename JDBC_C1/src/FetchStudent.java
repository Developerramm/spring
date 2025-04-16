import java.sql.*;

public class FetchStudent {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "ramkumar";

        String query = "SELECT * FROM spark.students;";

        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                String course = result.getString("course");

                System.out.println(id + " " + name + " " + age + " " + course);
            }
            result.close();
            stmt.close();
            conn.close();
            System.out.println("Connection created successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
