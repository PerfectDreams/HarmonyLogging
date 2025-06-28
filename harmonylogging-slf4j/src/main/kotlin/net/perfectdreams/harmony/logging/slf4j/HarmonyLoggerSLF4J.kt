package net.perfectdreams.harmony.logging.slf4j

import net.perfectdreams.harmony.logging.HarmonyLogger
import org.slf4j.Logger
import org.slf4j.event.Level

class HarmonyLoggerSLF4J(private val slf4jLogger: Logger) : HarmonyLogger {
    override fun log(
        level: net.perfectdreams.harmony.logging.Level,
        throwable: Throwable?,
        block: () -> String
    ) {
        val slf4jLevel = harmonyLoggingLevelToSLF4JLevel(level)

        if (slf4jLogger.isEnabledForLevel(slf4jLevel))
            slf4jLogger.atLevel(slf4jLevel).log(block(), throwable)
    }

    private fun harmonyLoggingLevelToSLF4JLevel(
        harmonyLevel: net.perfectdreams.harmony.logging.Level,
    ) = when (harmonyLevel) {
        net.perfectdreams.harmony.logging.Level.ERROR -> Level.ERROR
        net.perfectdreams.harmony.logging.Level.WARN -> Level.WARN
        net.perfectdreams.harmony.logging.Level.INFO -> Level.INFO
        net.perfectdreams.harmony.logging.Level.DEBUG -> Level.DEBUG
        net.perfectdreams.harmony.logging.Level.TRACE -> Level.TRACE
    }
}