package test;

import org.apache.log4j.Logger;

public class TestA {
    private final Logger LOG = Logger.getLogger("myProjectLog");

    public void outputLog () {
        LOG.debug("this is A class");
    }
}
