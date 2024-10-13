package com.flipfit.business;

import com.flipfit.bean.FlipFitSchedule;
import com.flipfit.bean.FlipFitSlot;

import java.util.Date;
import java.util.List;

public interface FlipFitScheduleInterface {

    FlipFitSchedule createSchedule(Date date, String slotId);

    FlipFitSchedule getScheduleByDateAndSlotId(Date date, String slotId);

    boolean modifySchedule(String scheduleId, int action);

    List<FlipFitSchedule> checkAvailability(String centerId, Date date);

    List<FlipFitSlot> getAllAvailableSlotsByDate(String centerId, Date date);

    FlipFitSchedule getOrCreateSchedule(String slotId, Date date);
}
