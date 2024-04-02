package com.acme.statusmgr.beans.facade;

public interface DetailFacadeInterface {

    int getAvailableProcessors();

    long getFreeJVMMemory();

    long getTotalJVMMemory();

    Runtime.Version getJreVersion();

    String getTempLocation();

}
