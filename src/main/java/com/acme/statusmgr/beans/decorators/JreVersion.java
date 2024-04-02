package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;

public class JreVersion extends DecoratorAbstractClass{


    public JreVersion(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        super(compiledDetails, detailFacade);
    }

    @Override
    public String getStatusDesc() {
        String statusDesc = super.getStatusDesc();
        return statusDesc + ", and the JRE version is " + detailFacade.getJreVersion();
    }

    @Override
    public Integer getRequestCost() {
        return super.getRequestCost() + 19;
    }
}
