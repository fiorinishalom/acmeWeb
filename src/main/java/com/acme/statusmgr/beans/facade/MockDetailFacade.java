package com.acme.statusmgr.beans.facade;

import com.acme.servermgr.ServerManager;

public class MockDetailFacade implements DetailFacadeInterface{
    @Override
    public int getAvailableProcessors() {
        return 4;
    }

    @Override
    public long getFreeJVMMemory() {
        return 127268272;
    }

    @Override
    public long getTotalJVMMemory() {
        return 159383552;
    }

    @Override
    public Runtime.Version getJreVersion() {
        return Runtime.Version.parse("15.0.2+7-27");
    }

    @Override
    public String getTempLocation() {
        return "M:\\\\AppData\\\\Local\\\\Temp";
    }

    @Override
    public String getStatus() {
        return "up";
    }
}
