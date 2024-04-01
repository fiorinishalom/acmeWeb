package com.acme.statusmgr.beans;

public class JreVersion extends DecoratorAbstractClass{


    public JreVersion(ServerInterface compiledDetails) {
        super(compiledDetails);
    }

    @Override
    public String getStatusDesc() {
        String statusDesc = super.getStatusDesc();
        return statusDesc + ", and the JRE version is " + Runtime.version();
    }

    @Override
    public Integer getRequestCost() {
        return super.getRequestCost() + 19;
    }
}
