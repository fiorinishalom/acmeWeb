package com.acme.statusmgr.beans;
/**
 * Interface defining methods for interacting with a server.
 */
public interface ServerInterface {

    /**
     * get the id of this request
     *
     * @return a numeric id that increases during life of server for each request .
     */
    long getId();

    /**
     * Get the content header that was specified by the request
     *
     * @return some string
     */
    String getContentHeader();


    /**
     * Get an english-like description of the server's current status,
     * obtained from the appropriate Manager class.
     *
     * @return A string describing status
     */
    String getStatusDesc();

    /**
     * Get the cost of this request
     * @return Integer representing the cost of request as number of pennies
     */
    Integer getRequestCost();
}
