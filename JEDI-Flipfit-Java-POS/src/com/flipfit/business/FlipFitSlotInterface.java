package com.flipfit.business;

import com.flipfit.bean.FlipFitSlot;

import java.util.List;

public interface FlipFitSlotInterface {

    List<FlipFitSlot> getAllSlotsByGymCenter(String centerId);

    FlipFitSlot getSlotById(String slotID);

    List<FlipFitSlot> getSlotList();

    void addSlotsForGym(String gymCenterId, List<FlipFitSlot> slotList);

    boolean isSlotValid(String slotID, String centerId);

    FlipFitSlot getSlotByIdAndGymCenterId(String slotID, String centerId);
}

