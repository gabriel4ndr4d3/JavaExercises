package com.exercises.easy.schedule;

public enum Error {
    INVALID_OPTION("Invalid option!"),
    INVALID_INDEX("Invalid index!"),
    NO_CONTACTS("No contacts!");

    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
