package com.Spring.took.InterfaceSegression.ProblemCode;

public class Seller implements User{
    @Override
    public boolean canBuyProduct() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public boolean ApproveProducts() {
        return false;
    }
}
