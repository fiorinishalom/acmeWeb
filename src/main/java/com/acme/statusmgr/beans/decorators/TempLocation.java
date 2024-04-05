package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Decorator class for adding information about file location to the status description
 * and increasing the request cost.
 */
public class TempLocation extends DecoratorAbstractClass{

    Logger logger = LoggerFactory.getLogger("TempLocationDecorator");

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
        logger.info("adding addedCost");
        int addedCost = 29;
        return super.getRequestCost() + addedCost;
    }


}
