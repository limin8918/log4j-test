package com.company;

import org.apache.log4j.Logger;

/**
 * Created by minli on 12/10/14.
 */
public class TestB {
    private final Logger LOG = Logger.getLogger(getClass());

    public void outputLog () {
        LOG.debug("this is B class");
    }
}
