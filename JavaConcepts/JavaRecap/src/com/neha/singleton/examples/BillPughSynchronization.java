package com.neha.singleton.examples;

public class BillPughSynchronization {

    private BillPughSynchronization(){

    }

    private static class BillPughSingleton{
        private static final BillPughSynchronization billPughSynchronization = new BillPughSynchronization();
    }

    public static BillPughSynchronization getInstance(){
        return BillPughSingleton.billPughSynchronization;
    }
}
