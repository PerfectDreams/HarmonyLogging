package net.perfectdreams.harmony.logging

interface HarmonyLoggerCreator {
    fun logger(block: () -> (Unit)): HarmonyLogger

    fun logger(name: String): HarmonyLogger
}