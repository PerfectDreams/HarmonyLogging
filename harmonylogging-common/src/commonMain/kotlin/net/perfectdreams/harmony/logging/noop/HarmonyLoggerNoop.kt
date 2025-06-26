package net.perfectdreams.harmony.logging.noop

import net.perfectdreams.harmony.logging.HarmonyLogger

class HarmonyLoggerNoop : HarmonyLogger {
    override fun info(throwable: Throwable?, block: () -> String) {}
    override fun warn(throwable: Throwable?, block: () -> String) {}
    override fun error(throwable: Throwable?, block: () -> String) {}
    override fun debug(throwable: Throwable?, block: () -> String) {}
    override fun trace(throwable: Throwable?, block: () -> String) {}
}