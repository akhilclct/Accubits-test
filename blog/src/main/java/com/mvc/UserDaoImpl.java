package com.mvc;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDaoImpl implements UserDao{
	
	  @Autowired
	  DataSource datasource;
	  
	  @Autowired
	  JdbcTemplate template;
	  
	  public void register(Userpojo user) {
		    String sql = "insert into register values(?,?,?,?,?,?,?)";
		    template.update(sql, new Object[] { user.getName(), user.getEmail(),user.getPassword() });
		    }
		    public Userpojo validateUser(Loginpojo login) {
		    String sql = "select * from register where username='" + login.getEmail() + "' and password='" + login.getPassword()
		    + "'";
		    List<Userpojo> users = template.query(sql, new UserMapper());
		    return users.size() > 0 ? users.get(0) : null;
		    }
		  }
		  class UserMapper implements RowMapper<Userpojo> {
		  public Userpojo mapRow(ResultSet rs, int arg1) throws SQLException {
		    Userpojo user = new Userpojo();
		    user.setName(rs.getString("name"));
		    user.setEmail(rs.getString("email"));
		    user.setPassword(rs.getString("password"));
		   
		    
		    return user;
		  }
		}
	  
	  

