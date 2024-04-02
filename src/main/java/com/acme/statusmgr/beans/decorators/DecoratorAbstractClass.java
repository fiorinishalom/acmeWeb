package com.acme.statusmgr.beans.decorators;

import com.acme.servermgr.ServerManager;
import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;

public abstract class DecoratorAbstractClass implements ServerInterface {
    /**
     * requestCost constant will have to be changed if we change costs or calc dynamically
     */
    protected ServerInterface compiledDetails;

    protected DetailFacadeInterface detailFacade;
    public DecoratorAbstractClass(ServerInterface compiledDetails, DetailFacadeInterface detailFacade) {
        this.compiledDetails = compiledDetails;
        this.detailFacade = detailFacade;
    }

    /**
     * get the id of this request
     *
     * @return a numeric id that increases during life of server for each request .
     */
    @Override
    public long getId() {
        return compiledDetails.getId();
    }

    /**
     * Get the content header that was specified by the request
     *
     * @return some string
     */
    @Override
    public String getContentHeader() {
        return compiledDetails.getContentHeader();
    }

    /**
     * Get an english-like description of the server's current status,
     * obtained from the appropriate Manager class.
     *
     * @return A string describing status
     */
    @Override
    public String getStatusDesc() {
        // Obtain current status of server
        return compiledDetails.getStatusDesc();
    }

    /**
     * Get the cost of this request
     *
     * @return Integer representing the cost of request as number of pennies
     */
    @Override
    public Integer getRequestCost() {
        return compiledDetails.getRequestCost();
    }


}



