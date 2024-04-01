package com.acme.statusmgr.beans;

public class TempLocation extends DecoratorAbstractClass{
    public TempLocation(ServerInterface compiledDetails) {
        super(compiledDetails);
    }

    @Override
    public String getStatusDesc() {
        String statusDesc = super.getStatusDesc();
        return statusDesc + ", and the server's temp file location is " + System.getenv("TEMP");
    }

    @Override
    public Integer getRequestCost() {
        return super.getRequestCost() + 29;
    }


}
