package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pleasePaint")       //durch Qualifyer wird Painting ausgewählt und nicht Drilling, ohne kommt Fehler
                                // da zwei Beans zur gleichen  Methode da sind, und spring nicht weiß welche
public class Painting implements Work {

    private static final Logger LOGGER = LoggerFactory.getLogger(Painting.class);

    @Override
    public void doWork() {
        LOGGER.info(" --> painting the wall black");
    }
}
