package com.acme.statusmgr.beans;

public class TotalJVMMemory extends DecoratorAbstractClass {
    public TotalJVMMemory(ServerInterface compiledDetails) {
        super(compiledDetails);
    }

    @Override
    public String getStatusDesc() {

        String statusDesc = super.getStatusDesc();

        return statusDesc + ", and there are " + Runtime.getRuntime().totalMemory() + " bytes of JVM memory";
    }

    @Override
    public Integer getRequestCost() {

        return super.getRequestCost() + 13;
    }
}
