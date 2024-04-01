package com.acme.statusmgr.beans;

public class FreeJVMMemory extends DecoratorAbstractClass{
    public FreeJVMMemory(ServerInterface compiledDetails) {
        super(compiledDetails);
    }

    @Override
    public String getStatusDesc() {

        String statusDesc = super.getStatusDesc();

        return statusDesc + ", and there are" + Runtime.getRuntime().freeMemory() + " bytes of JVM memory free";
    }

    @Override
    public Integer getRequestCost() {
        return super.getRequestCost() + 7;
    }


}
