package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Cleaning implements Work {
    private static final Logger LOGGER = LoggerFactory.getLogger(Drilling.class);

    public void doWork() {
        LOGGER.info(" --> clean up the room");
    }
}
