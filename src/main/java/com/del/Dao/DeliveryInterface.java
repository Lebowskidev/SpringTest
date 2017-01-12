package com.del.Dao;

import com.del.Entity.Delivery;

public interface DeliveryInterface {
	public Delivery findById(int id);
	void updateBike(Delivery del);
	
}
