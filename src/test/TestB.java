package test;

import org.apache.log4j.Logger;

public class TestB {
    private final Logger LOG = Logger.getLogger("parent.child");

    public void outputLog () {
        LOG.info("this is B class");
    }
}
