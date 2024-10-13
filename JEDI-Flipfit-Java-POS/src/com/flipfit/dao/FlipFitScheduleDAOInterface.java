package com.flipfit.dao;

import com.flipfit.bean.FlipFitSchedule;

import java.util.Date;
import java.util.List;

public interface FlipFitScheduleDAOInterface {

    void addSchedule(FlipFitSchedule schedule);

    FlipFitSchedule getScheduleById(String scheduleId);

    List<FlipFitSchedule> getScheduleListByDate(Date date);

    boolean modifySchedule(String scheduleId, int action);
}
