package com.mvc;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public interface UserDao {
	
	void register(Userpojo user);
	Userpojo validateUser(Loginpojo login);
	
	

}
