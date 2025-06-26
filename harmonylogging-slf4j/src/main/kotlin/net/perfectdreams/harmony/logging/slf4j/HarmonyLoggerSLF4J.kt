package net.perfectdreams.harmony.logging.slf4j

import net.perfectdreams.harmony.logging.HarmonyLogger
import org.slf4j.Logger
import org.slf4j.event.Level

class HarmonyLoggerSLF4J(private val slf4jLogger: Logger) : HarmonyLogger {
    override fun info(throwable: Throwable?, block: () -> String) {
        if (slf4jLogger.isInfoEnabled)
            slf4jLogger.info(block(), throwable)
    }

    override fun warn(throwable: Throwable?, block: () -> String) {
        if (slf4jLogger.isWarnEnabled)
            slf4jLogger.warn(block(), throwable)
    }

    override fun error(throwable: Throwable?, block: () -> String) {
        if (slf4jLogger.isErrorEnabled)
            slf4jLogger.error(block(), throwable)
    }

    override fun debug(throwable: Throwable?, block: () -> String) {
        if (slf4jLogger.isDebugEnabled)
            slf4jLogger.debug(block(), throwable)
    }

    override fun trace(throwable: Throwable?, block: () -> String) {
        if (slf4jLogger.isTraceEnabled)
            slf4jLogger.trace(block(), throwable)
    }
}