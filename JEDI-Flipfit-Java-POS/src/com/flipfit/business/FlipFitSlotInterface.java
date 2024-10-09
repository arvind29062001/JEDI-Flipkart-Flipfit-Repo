package com.flipfit.business;

import com.flipfit.bean.FlipfitGymSlot;

import java.util.List;

public interface FlipFitSlotInterface {
    void addSlotsForGym(String centerId, List<FlipfitGymSlot> newSlotList);
}
