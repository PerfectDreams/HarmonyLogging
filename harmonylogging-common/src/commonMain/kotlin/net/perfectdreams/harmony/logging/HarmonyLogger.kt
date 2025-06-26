package net.perfectdreams.harmony.logging

interface HarmonyLogger {
    /**
     * Logs an info message.
     *
     * @param block The lazily created message.
     */
    fun info(block: () -> (String)) {
        info(throwable = null, block)
    }

    /**
     * Logs a warn message.
     *
     * @param block The lazily created message.
     */
    fun warn(block: () -> (String)) {
        warn(throwable = null, block)
    }

    /**
     * Logs a error message.
     *
     * @param block The lazily created message.
     */
    fun error(block: () -> (String)) {
        warn(throwable = null, block)
    }

    /**
     * Logs a debug message.
     *
     * @param block The lazily created message.
     */
    fun debug(block: () -> (String)) {
        warn(throwable = null, block)
    }

    /**
     * Logs a trace message.
     *
     * @param block The lazily created message.
     */
    fun trace(block: () -> (String)) {
        warn(throwable = null, block)
    }

    /**
     * Logs an info message with an optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun info(throwable: Throwable?, block: () -> (String))

    /**
     * Logs an warn message with optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun warn(throwable: Throwable?, block: () -> (String))

    /**
     * Logs an error message with an optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun error(throwable: Throwable?, block: () -> (String))

    /**
     * Logs an debug message with an optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun debug(throwable: Throwable?, block: () -> (String))

    /**
     * Logs an trace message with optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun trace(throwable: Throwable?, block: () -> (String))
}