package com.acme.statusmgr.beans.facade;

public class DetailFacade implements DetailFacadeInterface{
    @Override
    public int getAvailableProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long getFreeJVMMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public long getTotalJVMMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override
    public Runtime.Version getJreVersion() {
        return Runtime.version();
    }

    @Override
    public String getTempLocation() {
        return System.getenv("TEMP");
    }
}
