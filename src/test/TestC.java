package test;

import org.apache.log4j.Logger;

public class TestC {
    private final Logger LOG = Logger.getLogger("myProjectLog");

    public void outputLog () {
        LOG.warn("this is C class");
    }
}
