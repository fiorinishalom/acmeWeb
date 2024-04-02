package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;

public class FreeJVMMemory extends DecoratorAbstractClass{


    public FreeJVMMemory(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        super(compiledDetails, detailFacade);
    }

    @Override
    public String getStatusDesc() {

        String statusDesc = super.getStatusDesc();

        return statusDesc + ", and there are" + detailFacade.getFreeJVMMemory() + " bytes of JVM memory free";
    }

    @Override
    public Integer getRequestCost() {
        return super.getRequestCost() + 7;
    }


}
