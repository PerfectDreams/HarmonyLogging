package net.perfectdreams.harmony.logging.noop

import net.perfectdreams.harmony.logging.HarmonyLoggerCreator

class HarmonyLoggerCreatorNoop : HarmonyLoggerCreator {
    companion object {
        val INSTANCE = HarmonyLoggerCreatorNoop()
        val LOGGER_INSTANCE = HarmonyLoggerNoop()
    }

    override fun logger(block: () -> Unit) = LOGGER_INSTANCE
    override fun logger(name: String) = LOGGER_INSTANCE
}