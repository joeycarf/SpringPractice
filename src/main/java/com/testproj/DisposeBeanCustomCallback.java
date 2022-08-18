package com.testproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;

public class DisposeBeanCustomCallback implements DisposableBean {
    private static final Logger logger = LoggerFactory.getLogger(DisposeBeanCustomCallback.class);

    @Override
    public void destroy() throws Exception {
        logger.debug("destroy()...");

    }
}
