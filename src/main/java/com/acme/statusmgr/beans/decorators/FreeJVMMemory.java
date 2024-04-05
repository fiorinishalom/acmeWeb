package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Decorator class for adding information about free JVM memory to the status description
 * and increasing the request cost.
 */
public class FreeJVMMemory extends DecoratorAbstractClass{
    Logger logger = LoggerFactory.getLogger("FreeJVMMemoryDecorator");

    public FreeJVMMemory(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        super(compiledDetails, detailFacade);
    }

    @Override
    public String getStatusDesc() {

        String statusDesc = super.getStatusDesc();

        return statusDesc + ", and there are " + detailFacade.getFreeJVMMemory() + " bytes of JVM memory free";
    }

    @Override
    public Integer getRequestCost() {
        logger.info("adding requestCost");
        int addedCost = 7;
        return super.getRequestCost() + addedCost;
    }


}
