package net.perfectdreams.harmony.logging

import net.perfectdreams.harmony.logging.noop.HarmonyLoggerCreatorNoop

object HarmonyLoggerFactory {
    private var CREATOR_IMPLEMENTATION: HarmonyLoggerCreator = HarmonyLoggerCreatorNoop.INSTANCE

    /**
     * Lazily initializes a logger.
     */
    // We use lazy here to avoid initializing the logger before the creator is set
    // TODO: Do we really need the block here?
    fun logger(block: () -> (Unit)) = lazy {
        return@lazy CREATOR_IMPLEMENTATION.logger(block)
    }

    fun logger(name: String) = lazy {
        return@lazy CREATOR_IMPLEMENTATION.logger(name)
    }

    fun setLoggerCreator(creator: HarmonyLoggerCreator) {
        this.CREATOR_IMPLEMENTATION = creator
    }
}