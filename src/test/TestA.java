package test;

import org.apache.log4j.Logger;

public class TestA {
    private final Logger LOG1 = Logger.getLogger("testOne");
    private final Logger LOG2 = Logger.getLogger("testTwo");
    private final Logger LOG3 = Logger.getLogger("testThree");

    public void outputLog () {
        LOG1.debug("this is A class, should in log one");
        LOG2.debug("this is A class, should in log two");
        LOG3.info("this is A class, the log level is error, so should not in log three");
        LOG3.warn("this is A class, the log level is correct, so should in log three");
    }
}
