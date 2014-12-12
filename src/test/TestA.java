package test;

import org.apache.log4j.Logger;

public class TestA {
    private final Logger LOG1 = Logger.getLogger("testOne");
    private final Logger LOG2 = Logger.getLogger("testTwo");

    public void outputLog () {
        LOG1.debug("this is A class, should in log one");
        LOG2.debug("this is A class, should in log two");
    }
}
