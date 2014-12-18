package test;

import org.apache.log4j.Logger;

/**
 * Created by minli on 12/18/14.
 */
public class TestD {
    private final Logger LOG = Logger.getLogger("testD");

    public void outputLog () {
        LOG.warn("this is D class");
    }
}
