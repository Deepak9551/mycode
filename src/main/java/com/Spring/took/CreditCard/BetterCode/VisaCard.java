package com.Spring.took.CreditCard.BetterCode;

public class VisaCard extends CreditCard implements InternationPaymentCompatible{
    @Override
    public void tapandpay() {
        System.out.println("Tap and pay of VISA");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer of VISA");
    }

    @Override
    public void swipeAndPlay() {
        System.out.println("Swipe and Play of VISA");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payment of VISA");
    }

    @Override
    public void internationalPayment() {
        System.out.println("Internation Payment of Visa");
    }
}