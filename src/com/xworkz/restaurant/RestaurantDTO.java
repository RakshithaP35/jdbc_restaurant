package com.xworkz.restaurant;

import java.io.Serializable;

public class RestaurantDTO implements Serializable{
	private int id;
	private String name;
	private String location;
	private String special;
	private boolean isBest;
	private RestaurantType type;
	
	RestaurantDTO(){
		System.out.println("default");
	}
	

	public RestaurantDTO(int id, String name, String location, String special, boolean isBest, RestaurantType type) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.special = special;
		this.isBest = isBest;
		this.type = type;
	}
	


	public RestaurantDTO(String name, String location, String special, boolean isBest, RestaurantType type) {
		super();
		this.name = name;
		this.location = location;
		this.special = special;
		this.isBest = isBest;
		this.type = type;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (isBest ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((special == null) ? 0 : special.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RestaurantDTO other = (RestaurantDTO) obj;
		if (id != other.id)
			return false;
		if (isBest != other.isBest)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (special == null) {
			if (other.special != null)
				return false;
		} else if (!special.equals(other.special))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RestaurantDTO [id=" + id + ", name=" + name + ", location=" + location + ", special=" + special
				+ ", isBest=" + isBest + ", type=" + type + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public boolean isBest() {
		return isBest;
	}

	public void setBest(boolean isBest) {
		this.isBest = isBest;
	}

	public RestaurantType getType() {
		return type;
	}

	public void setType(RestaurantType type) {
		this.type = type;
	}
	
	

}
