package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Decorator class for adding information about available processors to the status description
 * and increasing the request cost.
 */
public class AvailableProcessors extends DecoratorAbstractClass {
    Logger logger = LoggerFactory.getLogger("AvailableProcessorDecorator");

    public AvailableProcessors(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        super(compiledDetails, detailFacade);
    }


    @Override
    public String getStatusDesc() {

        return super.getStatusDesc() + ", and there are " + detailFacade.getAvailableProcessors() + " processors available";
    }

    @Override
    public Integer getRequestCost() {
        logger.info("adding requestCost");
        int addedCost = 3;
        return super.getRequestCost() + addedCost;
    }
}
