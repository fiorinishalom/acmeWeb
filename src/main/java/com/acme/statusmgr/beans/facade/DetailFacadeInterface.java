package com.acme.statusmgr.beans.facade;

/**
 * Interface defining methods for obtaining various details about the system.
 */
public interface DetailFacadeInterface {

    /**
     * Retrieves the number of available processors in the system.
     *
     * @return An integer representing the number of available processors.
     */
    int getAvailableProcessors();

    /**
     * Retrieves the amount of free memory in the JVM.
     *
     * @return A long representing the amount of free memory in bytes.
     */
    long getFreeJVMMemory();

    /**
     * Retrieves the total memory allocated to the JVM.
     *
     * @return A long representing the total memory allocated to the JVM in bytes.
     */
    long getTotalJVMMemory();

    /**
     * Retrieves the version of the Java Runtime Environment (JRE).
     *
     * @return A Runtime.Version object representing the version of the JRE.
     */
    Runtime.Version getJreVersion();

    /**
     * Retrieves the location of the temporary directory.
     *
     * @return A string representing the location of the temporary directory.
     */
    String getTempLocation();

    /**
     * Retrieves the current status.
     *
     * @return A string representing the current status.
     */
    String getStatus();
}
