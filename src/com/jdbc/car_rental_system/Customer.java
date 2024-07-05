package com.jdbc.car_rental_system;

public class Customer {
	
		private String customerId;
	    private String name;

	    public Customer(String customerId, String name) {
	        this.customerId = customerId;
	        this.name = name;
	    }

	    public Customer(String customerId2, Object name2) {
			// TODO Auto-generated constructor stub
		}

		public String getCustomerId() {
	        return customerId;
	    }

	    public String getName() {
	        return name;
	    }

}
