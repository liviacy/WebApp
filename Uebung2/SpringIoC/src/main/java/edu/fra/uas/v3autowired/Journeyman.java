package edu.fra.uas.v3autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class Journeyman {

    @Autowired
    @Qualifier("pleasePaint")
    Work work;

    @Autowired                          //2. Qualifier auch 2. Objekt und Qualifier in verschiedenen Klassen
    @Qualifier("pleaseCleane")
    Work work1;

    public void performWork() {
        work.doWork();
        work1.doWork();
   }
}
