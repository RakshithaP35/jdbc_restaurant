package com.xworkz.restaurant;

import java.util.Collection;

import com.xworkz.restaurant.dao.RestaurantDAO;
import com.xworkz.restaurant.dao.RestaurantDAOimpl;

public class RestaurantTester {

	public static void main(String[] args) {
	
		RestaurantDTO dto = new RestaurantDTO(1,"Swathi", "nagarbhavi","Lasagna",false,RestaurantType.SouthIndian);
		RestaurantDAO dao = new RestaurantDAOimpl();
		System.out.println(dto);
		dao.save(dto);

		

		RestaurantDTO dto1 = new RestaurantDTO("Jetlag","RajajiNagar","Fries",true,RestaurantType.SouthIndian);
		RestaurantDAO dao1 = new RestaurantDAOimpl();
		dao1.save(dto1);
		System.out.println(dto1);
		
		Collection<RestaurantDTO> collection = dao.findByType(RestaurantType.SouthIndian);
		collection.forEach(ref->System.out.println(ref));
		

		System.out.println(dao.updateTypeByName(RestaurantType.NorthIndian, "albek"));
		
		System.out.println(dao.deleteByTypeAndName(RestaurantType.NorthIndian, "albek"));
		
		
		}

}
