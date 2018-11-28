package com.khoiron.footballmatchschedule.util.context

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

/**
 * Created by Khoiron14 on 28/11/18.
 */
open class CoroutinesContextProvider {
    open val main: CoroutineContext by lazy { Dispatchers.Main }
}