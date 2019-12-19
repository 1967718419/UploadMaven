package com.hous.service.hetong;

import com.hous.pojo.Hetong;

public interface HetongService {

	public void inserthetong(Hetong hetong);
	public Hetong findhetong(String houseId);
	public void updatehetong(Hetong hetong);
	public void deletehetong(String house_id);
}
