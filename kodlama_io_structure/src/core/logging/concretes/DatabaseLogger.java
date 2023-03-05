package core.logging.concretes;

import core.logging.abstracts.Logger;
import entities.concretes.Log;

public class DatabaseLogger implements Logger {

    @Override
    public void log(Log log) {
        System.out.println("Database Log: " + log.getMessage());
    }

}
