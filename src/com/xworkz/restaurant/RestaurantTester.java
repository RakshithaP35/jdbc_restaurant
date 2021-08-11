package com.xworkz.restaurant;

import com.xworkz.restaurant.dao.RestaurantDAO;
import com.xworkz.restaurant.dao.RestaurantDAOimpl;

public class RestaurantTester {

	public static void main(String[] args) {
	
		RestaurantDTO dto= new RestaurantDTO(1,"Swathi","Nagarbhavi","Lasagna",true,RestaurantType.SouthIndian);
		RestaurantDAO dao = new RestaurantDAOimpl();
		dao.save(dto);

	}

}
