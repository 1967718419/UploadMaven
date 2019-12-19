package com.hous.service.Schedule;

import java.util.List;

import com.hous.pojo.Schedule;


public interface ScheduleService {
	public void insertschedule(Schedule schedule);
	public List<Schedule> selectAll();
	public void deleteschedule(Integer id);
	public void updateschedule(Schedule schedule);
	public Schedule selectbyid(Integer id);
}
