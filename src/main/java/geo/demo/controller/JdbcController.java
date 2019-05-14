package geo.demo.controller;

import geo.demo.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping
public class JdbcController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/user_list")
    public List<User> getUserList(){
        String sql = "SELECT * FROM user";
        List<User> userlist = jdbcTemplate.query(sql, new RowMapper<User>() {
            User user = null;
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                user = new User();
                user.setName(resultSet.getString("name"));
                user.setId(resultSet.getInt("id"));
                return user;
            }
        });
        for(User user:userlist){
            System.out.println(user.getName());
        }
        return userlist;
    }
}
