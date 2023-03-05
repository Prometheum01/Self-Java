package core.logging.concretes;

import core.logging.abstracts.Logger;
import entities.concretes.Log;

public class FileLogger implements Logger {

    @Override
    public void log(Log log) {
        System.out.println("File Log: " + log.getMessage());
    }

}
