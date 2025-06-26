package net.perfectdreams.harmony.logging.slf4j

import net.perfectdreams.harmony.logging.HarmonyLogger
import net.perfectdreams.harmony.logging.HarmonyLoggerCreator
import org.slf4j.LoggerFactory

class HarmonyLoggerCreatorSLF4J : HarmonyLoggerCreator {
    override fun logger(block: () -> Unit): HarmonyLogger {
        val caller = Thread.currentThread().stackTrace[2]
        val parentClazz = Class.forName(caller.className)

        val logger = LoggerFactory.getLogger(parentClazz)

        println("ayaya")
        return HarmonyLoggerSLF4J(logger)
    }
}