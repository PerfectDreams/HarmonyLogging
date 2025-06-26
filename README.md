# HarmonyLogging

A multiplatform Kotlin logger facade created just for fun.

This has been created because while I do think that the "Kotlin Logging" is a very nice library, I don't know *why* it needs so many updates... and why it has changed packages *two times*!!

So I've decided to roll my own library. :3

But should you use this? Probably not...

How to use:

In your main function...

```kotlin
HarmonyLoggerFactory.setLoggerCreator(HarmonyLoggerCreatorSLF4J())
```

The reason why you need to manually set the logger creator is because I wanted to allow users to provide their own `HarmonyLogger` and `HarmonyLoggerCreator` implementations.

If you don't do this, all logs will be noop!

```kotlin
class HowdyWorld {
    companion object {
        val logger by HarmonyLoggerFactory.logger {}
    }
    
    fun howdyWorld() {
        logger.info { "Howdy World!" }
    }
}
```

That's it!