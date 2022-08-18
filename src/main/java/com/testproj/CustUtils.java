package com.testproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustUtils {

    private static final Logger logger = LoggerFactory.getLogger(CustUtils.class);

    static {
        logger.trace("Inside static block");
    }

    {
        logger.trace("Inside anonymous block..");
    }

    public CustUtils() {
        logger.trace("Inside constructor..");
    }
    public String concatenate(String string1, String string2) {
        logger.trace("Inside concatenate method");
        return String.format("%s %s", string1, string2);
    }

}
