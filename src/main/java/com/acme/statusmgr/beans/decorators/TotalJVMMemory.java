package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Decorator class for adding information about total JVM memory to the status description
 * and increasing the request cost.
 */
public class TotalJVMMemory extends DecoratorAbstractClass {
    Logger logger = LoggerFactory.getLogger("TotalJVMMemoryDecorator");


    public TotalJVMMemory(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        super(compiledDetails, detailFacade);
    }

    @Override
    public String getStatusDesc() {

        String statusDesc = super.getStatusDesc();

        return statusDesc + ", and there is a total of " + detailFacade.getTotalJVMMemory() + " bytes of JVM memory";
    }

    @Override
    public Integer getRequestCost() {
        logger.info("adding addedCost");
        int addedCost = 13;
        return super.getRequestCost() + addedCost;
    }
}
