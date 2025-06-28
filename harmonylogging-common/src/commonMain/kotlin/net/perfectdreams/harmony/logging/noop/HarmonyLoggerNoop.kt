package net.perfectdreams.harmony.logging.noop

import net.perfectdreams.harmony.logging.HarmonyLogger
import net.perfectdreams.harmony.logging.Level

class HarmonyLoggerNoop : HarmonyLogger {
    override fun log(level: Level, throwable: Throwable?, block: () -> String) {}
}