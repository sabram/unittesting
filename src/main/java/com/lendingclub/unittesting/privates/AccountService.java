package com.lendingclub.unittesting.privates;

public class AccountService {

    public boolean isValid(Account account) {
        return isOverdrawn(account.getBalance());
    }

    private boolean isOverdrawn(int balance) {
        return balance < 0;
    }

}
