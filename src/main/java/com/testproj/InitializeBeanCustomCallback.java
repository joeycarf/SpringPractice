package com.testproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

public class InitializeBeanCustomCallback implements InitializingBean {
    private static final Logger logger = LoggerFactory.getLogger(InitializeBeanCustomCallback.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("afterPropertiesSet()...");
    }
}
