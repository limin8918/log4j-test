package test;

import org.apache.log4j.Logger;

public class TestC {
    private final Logger LOG = Logger.getLogger("parent.child.child");

    public void outputLog () {
        LOG.warn("this is C class");
    }
}
