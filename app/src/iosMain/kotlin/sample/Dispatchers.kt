package sample

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable


internal actual val Main: CoroutineDispatcher = NsQueueDispatcher(dispatch_get_main_queue())

internal actual val Background: CoroutineDispatcher = Main

internal class NsQueueDispatcher(
    private val dispatchQueue: dispatch_queue_t
) : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        dispatch_async(dispatchQueue) {
            block.run()
        }
    }
}