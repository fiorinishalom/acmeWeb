package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;

public class AvailableProcessors extends DecoratorAbstractClass {


    public AvailableProcessors(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        super(compiledDetails, detailFacade);
    }

    @Override
    public String getStatusDesc() {

        String statusDesc = super.getStatusDesc();

        return statusDesc + ", and there are " + detailFacade.getAvailableProcessors() + " processors available";
    }

    @Override
    public Integer getRequestCost() {
        // Add 3 to the request cost
        return super.getRequestCost() + 3;
    }
}
