package geo.demo.controller;

import geo.demo.entity.country;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping
public class JdbcController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<country> getUserList(@RequestParam String countryName){
        String sql = "SELECT * FROM "+countryName;
        List<country> countrylist = jdbcTemplate.query(sql, new RowMapper<country>() {
            country country = null;
            @Override
            public country mapRow(ResultSet resultSet, int i) throws SQLException {
                country = new country();
                country.setOBJECTID(resultSet.getInt("OBJECTID"));
                country.setDLBM(resultSet.getString("DLBM"));
                country.setDLMC(resultSet.getString("DLMC"));
                country.setSHAPE_Leng(resultSet.getDouble("SHAPE_Leng"));
                country.setSHAPE_Length(resultSet.getDouble("SHAPE_Length"));
                country.setSHAPE_Area(resultSet.getDouble("SHAPE_Area"));
                return country;
            }
        });
        return countrylist;
    }
}
