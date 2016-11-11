package com.fows.database;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public class DatabaseClient {

    private static DatabaseClient instance;

    public static DatabaseClient getInstance() {
        if (instance == null) {
            instance = new DatabaseClient();
        }
        return instance;
    }

    public String getLogStatus() {
        return "DatabaseClient is clear";
    }
}
