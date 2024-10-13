package com.flipfit.dao;

import com.flipfit.bean.FlipFitSlot;

import java.util.List;

public interface FlipFitSlotDAOInterface {

    List<FlipFitSlot> getSlotList();

    List<FlipFitSlot> getSlotListByCenterId(String centerId);

    void addSlot(FlipFitSlot slot);

    FlipFitSlot getSlotById(String slotId);

    FlipFitSlot getSlotByIdAndCenterId(String slotId, String centerId);
}
