package com.pickth.commons.extensions

import android.content.Context
import android.os.Looper

fun Context.isOnMainThread() = Looper.myLooper() == Looper.getMainLooper()