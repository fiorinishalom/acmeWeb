package com.acme.statusmgr.beans.decorators;

import com.acme.servermgr.ServerManager;
import com.acme.statusmgr.beans.ServerInterface;
import com.acme.statusmgr.beans.facade.DetailFacadeInterface;
/**
 * Abstract class serving as a base for decorators to add functionality to ServerInterface implementations.
 */
public abstract class DecoratorAbstractClass implements ServerInterface {

    protected ServerInterface compiledDetails;
    protected DetailFacadeInterface detailFacade;

    /**
     * Construct a Decorator using information passed in to obtain details of environment.
     * This class must append information about specific requested detail and added cost of obtaining the information.
     *
     * @param compiledDetails The compiled details to be decorated.
     * @param detailFacade the detail facade to be used for retrieving detailed information.
     */
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



