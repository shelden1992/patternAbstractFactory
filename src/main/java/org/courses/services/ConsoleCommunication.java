package org.courses.services;

public class ConsoleCommunication {
    private static final ConsoleCommunication INSTANCE = new ConsoleCommunication();

    private ConsoleCommunication() {
    }

    public static ConsoleCommunication getInstance() {
        return INSTANCE;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
