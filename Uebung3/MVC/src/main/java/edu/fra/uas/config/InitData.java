package edu.fra.uas.config;

import org.slf4j.Logger; // Logger-Interface für die Ausgabe von Debug- und Fehlernachrichten.
import org.springframework.beans.factory.annotation.Autowired; // Annotation zur automatischen Dependency Injection.
import org.springframework.stereotype.Component; // Markiert die Klasse als Spring-Komponente.

import edu.fra.uas.model.User; // Importiert das User-Modell.
import edu.fra.uas.service.UserService; // Importiert den Service zur Benutzerverwaltung.
import jakarta.annotation.PostConstruct; // Annotation zur Markierung einer Methode, die nach der Initialisierung aufgerufen wird.

@Component // Markiert diese Klasse als Spring-Komponente, sodass sie automatisch von Spring verwaltet wird.
public class InitData {

    private final Logger log = org.slf4j.LoggerFactory.getLogger(InitData.class); 
    // Logger zur Ausgabe von Debug-Nachrichten, um den Initialisierungsprozess zu protokollieren.

    @Autowired // Automatische Injektion des UserService, um die Benutzerverwaltung zu ermöglichen.
    UserService userService;

    @PostConstruct // Diese Methode wird direkt nach der Konstruktion des Beans ausgeführt.
    public void init() {
        log.debug("### Initialize Data ###"); 
        // Protokolliert den Start der Dateninitialisierung.

        // Erstellt und speichert einen Benutzer mit der Rolle "ADMIN".
        log.debug("create user admin");
        User user = new User(); 
        user.setRole("ADMIN");
        user.setFirstName("Administrator");
        user.setLastName("Administrator");
        user.setEmail("admin@example.com");
        user.setPassword("extremeSecurePassword1234"); 
        // Benutzer mit sicheren Passwort-Daten.
        userService.createUser(user); 
        // Speichert den Benutzer mit Hilfe des UserService.

        // Erstellt und speichert einen Benutzer mit der Rolle "USER".
        log.debug("create user alice");
        user = new User();
        user.setRole("USER");
        user.setFirstName("Alice");
        user.setLastName("Adams");
        user.setEmail("alice@example.com");
        user.setPassword("alice1234"); 
        userService.createUser(user);

        // Erstellt und speichert einen weiteren Benutzer mit der Rolle "USER".
        log.debug("create user bob");
        user = new User();
        user.setRole("USER");
        user.setFirstName("Bob");
        user.setLastName("Builder");
        user.setEmail("bob@example.com");
        user.setPassword("bob1234");
        userService.createUser(user);

        log.debug("### Data initialized ###");
        // Signalisiert, dass die Dateninitialisierung abgeschlossen ist.
    }

}
