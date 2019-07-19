package com.example.demo.Dto;

public class HotelDto {


    private long id;
    
    private String name;    
    private String address;
    private int rating;
    private boolean status;
    
   
 
    public HotelDto() {}
    
    public HotelDto(String name, String address, int rating, boolean status) {    	
    	this.name = name;
    	this.address = address;
    	this.rating = rating;
    	
    	this.status = false;
    }
    
    public String getAddress() {
        return address;
    }

	
    public long getId() {
        return id;
    }

  

  

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }



    public void setAddress(String address) {
        this.address = address;
    }
    
   
    public void setId(long id) {
        this.id = id;
    }
    
  
	public void setName(String name) {
        this.name = name;
    }
	
	public void setRating(int rating) {
        this.rating = rating;
    }

	

	@Override
    public String toString() {
    	return "Id: " + getId() + "\nName: " + getName() + "\nAddress: " + getAddress() + "\nRating: " + getRating();
    }

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

