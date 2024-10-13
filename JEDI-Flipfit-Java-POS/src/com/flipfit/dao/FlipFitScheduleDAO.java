package com.flipfit.dao;

import com.flipfit.bean.FlipFitSchedule;
import com.flipfit.constant.SQLConstants;
import com.flipfit.helper.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlipFitScheduleDAO implements FlipFitScheduleDAOInterface {

    public void addSchedule(FlipFitSchedule schedule) {
        try {
            Connection conn = DatabaseConnection.connect();
            PreparedStatement ps = conn.prepareStatement(SQLConstants.ADD_SCHEDULE);
            ps.setString(1, schedule.getScheduleId());
            ps.setString(2, schedule.getDate().toString());
            ps.setString(3, schedule.getSlotId());
            ps.setInt(4, schedule.getAvailability());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public FlipFitSchedule getScheduleById(String scheduleId) {
        FlipFitSchedule schedule = null;
        try {
            Connection conn = DatabaseConnection.connect();
            PreparedStatement ps = conn.prepareStatement(SQLConstants.GET_SCHEDULES_BY_ID);
            ps.setString(1, scheduleId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String slotId = rs.getString("slotId");
                int availability = rs.getInt("availability");
                String date = rs.getString("date");
                LocalDate localDate = LocalDate.parse(date);
                schedule = new FlipFitSchedule(localDate, slotId, availability);
                schedule.setScheduleId(scheduleId);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return schedule;
    }

    public List<FlipFitSchedule> getScheduleListByDate(Date date) {
        ArrayList<FlipFitSchedule> schedules = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.connect();
            PreparedStatement ps = conn.prepareStatement(SQLConstants.GET_SCHEDULES_BY_DATE);
            ps.setString(1, date.toString());
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                String slotId = rs.getString("slotId");
                int availability = rs.getInt("availability");
                String scheduleId = rs.getString("scheduleId");
                LocalDate localDate = LocalDate.parse(date.toString());
                FlipFitSchedule schedule = new FlipFitSchedule(localDate, slotId, availability);
                schedule.setScheduleId(scheduleId);
                schedules.add(schedule);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return schedules;
    }

    public boolean modifySchedule(String scheduleId, int action) {
        try {
            int availability = getScheduleById(scheduleId).getAvailability();
            if(availability < 1 && action == -1) {
                return false;
            }
            Connection conn = DatabaseConnection.connect();
            PreparedStatement ps = conn.prepareStatement(SQLConstants.MODIFY_SCHEDULE_AVAILABILTY);
            ps.setInt(1, availability+action);
            ps.setString(2, scheduleId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}
