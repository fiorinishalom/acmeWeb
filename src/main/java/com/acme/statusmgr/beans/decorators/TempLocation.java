package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;

public class TempLocation extends DecoratorAbstractClass{

    public TempLocation(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        super(compiledDetails, detailFacade);
    }

    @Override
    public String getStatusDesc() {
        String statusDesc = super.getStatusDesc();
        return statusDesc + ", and the server's temp file location is " + detailFacade.getTempLocation();
    }

    @Override
    public Integer getRequestCost() {
        return super.getRequestCost() + 29;
    }


}
