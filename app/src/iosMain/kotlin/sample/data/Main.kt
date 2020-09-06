package sample.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

internal actual val Main: CoroutineDispatcher
    get() = Dispatchers.Main
internal actual val Background: CoroutineDispatcher
    get() = Dispatchers.Default