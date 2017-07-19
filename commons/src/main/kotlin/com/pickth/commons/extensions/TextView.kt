package com.pickth.commons.extensions

import android.widget.TextView

/**
 * Created by yonghoon on 2017-07-19.
 * Mail   : yonghoon.kim@pickth.com
 */
val TextView.value: String get() = text.toString().trim()