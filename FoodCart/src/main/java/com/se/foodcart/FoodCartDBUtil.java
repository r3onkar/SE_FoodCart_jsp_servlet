package com.se.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtil {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException {

		String jdbcURL = "jdbc:mysql://localhost:3306/food?useSSL=false";
		String jdbcUsername = "root";
		String jdbcPassword = "r3DSons";

		ArrayList<Food> food = new ArrayList<>();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("select * from foodcart");

		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String item = resultSet.getString(2);
			float price = resultSet.getFloat(3);

			Food food2 = new Food(id, item, price);

			food.add(food2);

		}

		return food;
	}
}
