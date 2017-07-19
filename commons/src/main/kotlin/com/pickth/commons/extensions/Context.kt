package com.pickth.commons.extensions

import android.content.Context
import android.os.Looper

/**
 * Created by yonghoon on 2017-07-18.
 * Mail   : yonghoon.kim@pickth.com
 */
fun Context.isOnMainThread() = Looper.myLooper() == Looper.getMainLooper()