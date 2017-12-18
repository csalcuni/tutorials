package it.scp.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLog {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloLog.class);

        final String message = "Hello logging!";
        logger.trace(message);
        logger.debug(message);
        logger.info(message);
        logger.warn(message);
        logger.error(message);
    }
}
