package com.xworkz.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.restaurant.RestaurantDTO;
import com.xworkz.restaurant.constant.RestaurantConstant;

public class RestaurantDAOimpl implements RestaurantDAO{
	

	@Override
	public int save(RestaurantDTO dto) {
		System.out.println("saving dto into dao" + dto);
		Connection tempConnection = null;
		try(Connection connection = DriverManager.getConnection(RestaurantConstant.URL,RestaurantConstant.USERNAME,RestaurantConstant.SECRET)){
			tempConnection= connection;
			connection.setAutoCommit(false);
			String query = "insert into restaurant_table values(1,'"+dto.getName()+"','"+dto.getLocation()+"','"+dto.getSpecial()+"',"+dto.isBest()+",'"+dto.getType()+"')";
			Statement statement = connection.createStatement();
			statement.execute(query);
			connection.commit();
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			try {
				tempConnection.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}

}
