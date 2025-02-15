package com.Spring.took.CreditCard.BetterCode;

public class Rupay extends CreditCard implements upiCompatibleCard
{
    @Override
    public void tapandpay() {
        System.out.println("Tap and pay of RU_PAY");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer of RU_PAY");
    }

    @Override
    public void swipeAndPlay() {
        System.out.println("Swipe and Play of RU_PAY");
    }

    @Override
    public void mandatePayments() {
        System.out.println("mandatePayments of RU_PAY");
    }


    @Override
    public void upiPayment() {
        System.out.println("UPI payment of Ru pay");
    }
}
