package com.hous.service.applyout;

import com.hous.pojo.Applyout;
import com.hous.pojo.Zulist;

public interface ApplyoutService {
	public void insertapplyout(Zulist zulist);
	public void updateapplyout(Applyout applyout);
	public void agreeapplyout(Integer aoid);
	public void deleteapplyout(Integer aoid);
}
