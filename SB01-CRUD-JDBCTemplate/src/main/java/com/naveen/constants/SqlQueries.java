package com.naveen.constants;

public class SqlQueries {

	public static final String SELECT_ALL_USERS = "SELECT * FROM user";
	public static final String SELECT_USER_BY_ID = "SELECT * FROM user WHERE id = ?";
	public static final String INSERT_USER = "INSERT INTO user (name, email) VALUES (?, ?)";
	public static final String UPDATE_USER = "UPDATE user SET name = ?, email = ? WHERE id = ?";
	public static final String DELETE_USER = "DELETE FROM user WHERE id = ?";

}
