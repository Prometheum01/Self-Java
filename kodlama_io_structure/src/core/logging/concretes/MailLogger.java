package core.logging.concretes;

import core.logging.abstracts.Logger;
import entities.concretes.Log;

public class MailLogger implements Logger {

    @Override
    public void log(Log log) {
        System.out.println("Mail Log: " + log.getMessage());
    }

}
