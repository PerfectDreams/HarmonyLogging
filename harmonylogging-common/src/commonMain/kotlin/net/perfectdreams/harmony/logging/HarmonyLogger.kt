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
     * Logs a message at level [Level].
     *
     * @param level The level of the message
     * @param block The lazily created message.
     */
    fun log(level: Level, block: () -> (String)) {
        log(level, throwable = null, block)
    }

    /**
     * Logs an info message with an optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun info(throwable: Throwable?, block: () -> (String)) {
        log(level = Level.INFO, throwable = throwable, block)
    }

    /**
     * Logs an warn message with optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun warn(throwable: Throwable?, block: () -> (String)) {
        log(level = Level.WARN, throwable = throwable, block)
    }

    /**
     * Logs an error message with an optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun error(throwable: Throwable?, block: () -> (String)) {
        log(level = Level.ERROR, throwable = throwable, block)
    }

    /**
     * Logs an debug message with an optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun debug(throwable: Throwable?, block: () -> (String)) {
        log(level = Level.DEBUG, throwable = throwable, block)
    }

    /**
     * Logs an trace message with optional throwable.
     *
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun trace(throwable: Throwable?, block: () -> (String)) {
        log(level = Level.TRACE, throwable = throwable, block)
    }

    /**
     * Logs a message at level [Level] with optional throwable.
     *
     * @param level The level of the message
     * @param block The lazily created message.
     * @param throwable The optional throwable to log.
     */
    fun log(level: Level, throwable: Throwable?, block: () -> (String))
}