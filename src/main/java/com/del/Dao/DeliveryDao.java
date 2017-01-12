package com.del.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.del.Entity.Delivery;

@Repository("DeliveryDao")

public class DeliveryDao implements DeliveryInterface{
	@Autowired
	private JdbcTemplate jdbc;

	public static class workingWithRowMap implements RowMapper<Delivery> {
	
		public Delivery mapRow(ResultSet rs, int rowNum) throws SQLException {
			Delivery bike = new Delivery();
			bike.setId(rs.getInt(1));
			bike.setGoods (rs.getString(2));
			bike.setPrice(rs.getInt(3));

			return bike;
		}
	}

	public Delivery findById(int id) {
		final String SQL = "SELECT * FROM menu WHERE id=?";
		Delivery del = jdbc.queryForObject(SQL, new workingWithRowMap(), id);
		return del;
	}
	
	public void updateBike(Delivery del){
		final String SQL = "UPDATE menu SET goods=?, price=? WHERE id=?";
		final int id = del.getId();
		final String goods = del.getGoods();
		final int price = del.getPrice();
				
		jdbc.update(SQL, new Object[]{id,goods,price});
	}

}