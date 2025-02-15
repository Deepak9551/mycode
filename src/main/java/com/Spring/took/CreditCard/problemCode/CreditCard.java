package com.Spring.took.CreditCard.problemCode;

public abstract class CreditCard {
    private  String ccNumber;
    private String ownerName;
    private int ccv;

    public abstract void tapandpay();

    public abstract void onlineTransfer();

    public abstract void swipeAndPlay();

    public abstract void mandatePayments();

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public void displayCreditCard(){
        System.out.println("CCNumber "+this.ccNumber +" ,with_owner_name "+" "+ownerName);
    }
}
