package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;

public class TotalJVMMemory extends DecoratorAbstractClass {


    public TotalJVMMemory(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        super(compiledDetails, detailFacade);
    }

    @Override
    public String getStatusDesc() {

        String statusDesc = super.getStatusDesc();

        return statusDesc + ", and there are " + detailFacade.getTotalJVMMemory() + " bytes of JVM memory";
    }

    @Override
    public Integer getRequestCost() {

        return super.getRequestCost() + 13;
    }
}
