package com.testproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("Starting main..");
        ApplicationContext context = new ClassPathXmlApplicationContext("beanslist.xml");
        CustUtils custUtils = (CustUtils) context.getBean(CustUtils.class);
        logger.debug(custUtils.concatenate("Joey", "carlo"));

        CustUtils custUtils1 = (CustUtils) context.getBean(CustUtils.class);
        logger.debug(custUtils1.concatenate("Francisco", "Jooey"));
    }
}
