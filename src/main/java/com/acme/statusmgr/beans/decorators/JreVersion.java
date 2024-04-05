package com.acme.statusmgr.beans.decorators;

import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Decorator class for adding information about the JRE version to the status description
 * and increasing the request cost.
 */
public class JreVersion extends DecoratorAbstractClass{

    Logger logger = LoggerFactory.getLogger("JreVersionDecorator");


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
        logger.info("adding addedCost");
        int addedCost = 19;
        return super.getRequestCost() + addedCost;
    }
}
