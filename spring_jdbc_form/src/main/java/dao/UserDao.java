package dao;

import entity.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate jdbcTemplate;
    public int saveUser(User user){
        String sql = "insert into user(name,email,password) values(?,?,?)";
        int i = jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getPassword());
        return i;
    }
}
