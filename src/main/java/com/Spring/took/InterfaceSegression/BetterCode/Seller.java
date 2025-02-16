package com.Spring.took.InterfaceSegression.BetterCode;

public class Seller implements IcanModify ,IcanSell ,IcanBuy{
    @Override
    public void buy() {
        System.out.println("seller can can");
    }

    @Override
    public void modify() {
        System.out.println("seller can modify");
    }

    @Override
    public void sell() {
        System.out.println("seller can sell");
    }
}
