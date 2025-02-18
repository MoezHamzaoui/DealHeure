package com.dh.model;

class SynchronizeCounter {

    private static int count = 0;
    /**
     * Increments count in a thread-safe manner.
     * @return counter
     */
    public synchronized static int increment() {
        count = count + 1;
        return count;
    }

}
