package com.flipfit.business;

import com.flipfit.bean.FlipFitSchedule;
import com.flipfit.bean.FlipFitSlot;
import com.flipfit.dao.FlipFitSlotDAO;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlipFitSlotService implements FlipFitSlotInterface {
    private static final FlipFitSlotDAO flipFitSlotDAO = new FlipFitSlotDAO();

    public List<FlipFitSlot> getAllSlotsByGymCenter(String centerId) {
        return flipFitSlotDAO.getSlotListByCenterId(centerId);
    }

    public FlipFitSlot getSlotById(String slotId) {
        return flipFitSlotDAO.getSlotById(slotId);
    }

    public List<FlipFitSlot> getSlotList() {
       return flipFitSlotDAO.getSlotList();
    }

    public void addSlotsForGym(String gymCenterId, List<FlipFitSlot> slotList) {
        for(FlipFitSlot slot : slotList) {
            slot.setGymCenterId(gymCenterId);
            flipFitSlotDAO.addSlot(slot);
        }
    }

    public boolean isSlotValid(String slotID, String centerId) {
        return true;
    }

    public FlipFitSlot getSlotByIdAndGymCenterId(String slotID, String centerId) {
        return flipFitSlotDAO.getSlotByIdAndCenterId(slotID, centerId);
    }
}
