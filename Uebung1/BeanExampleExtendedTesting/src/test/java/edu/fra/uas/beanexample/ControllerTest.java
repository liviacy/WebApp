package edu.fra.uas.beanexample;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private MessageService messageService; // Hier wird die Instanz von Spring injiziert

    @Test
    public void testIncrement() {
        // Initialwert prüfen
        assertEquals(0, messageService.getCounter());

        // Methode increment aufrufen
        messageService.increment();

        // Prüfen, ob der Counter erhöht wurde
        assertEquals(1, messageService.getCounter());

        // Nochmals increment aufrufen
        messageService.increment();

        // Prüfen, ob der Counter jetzt 2 ist
        assertEquals(2, messageService.getCounter());
    }

    
     @Autowired
     private BeanController beanController;

     @Test
     void testController() {
         assertThat(beanController.putMessage("Das ist ein Test")).isEqualTo("Das ist ein Test");
     }



}
