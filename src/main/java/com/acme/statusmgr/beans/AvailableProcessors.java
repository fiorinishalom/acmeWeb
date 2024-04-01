package com.acme.statusmgr.beans;

public class AvailableProcessors extends DecoratorAbstractClass {

    public AvailableProcessors(ServerInterface compiledDetails) {
        super(compiledDetails);

    }

    @Override
    public String getStatusDesc() {

        String statusDesc = super.getStatusDesc();

        return statusDesc + ", and there are " + Runtime.getRuntime().availableProcessors() + " processors available";
    }

    @Override
    public Integer getRequestCost() {
        // Add 3 to the request cost
        return super.getRequestCost() + 3;
    }
}
