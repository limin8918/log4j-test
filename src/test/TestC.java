package test;

import org.apache.log4j.Logger;

public class TestC {
    private final Logger LOG = Logger.getLogger("myLog");

    public void outputLog () {
        LOG.warn("this is C class");
    }
}
