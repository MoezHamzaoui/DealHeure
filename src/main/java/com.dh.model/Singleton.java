package com.dh.model;

public class Singleton {

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Inner static class responsible for holding the Singleton instance
    private static class SingletonHelper {
        // The Singleton instance is created only when the class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide access to the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
