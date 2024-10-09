package com.flipfit.bean;

public class FlipfitGymOwner extends Person{


   private String uniqueIdProof;
   private String gstNumber;


   // Getter & Setter
   public String getUniqueIdProof() {
      return uniqueIdProof;
   }

   public void setUniqueIdProof(String uniqueIdProof) {
      this.uniqueIdProof = uniqueIdProof;
   }

   public String getGstNumber() {
      return gstNumber;
   }

   public void setGstNumber(String gstNumber) {
      this.gstNumber = gstNumber;
   }

   public FlipfitGymOwner(String userId, String userName, String email, String password, String customerPhone,String unique_id_proof) {
      super(userName,email,customerPhone,userId,password);
   }

//
//   //Method
//
//   public void registerGym(){
//
//   }
//
//   public void updateSlot(){
//
//
//   }



}
