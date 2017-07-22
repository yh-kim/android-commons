package com.pickth.commons.mvp

import android.content.Context
import android.view.View

/**
 * Created by yonghoon on 2017-07-18.
 * Mail   : yonghoon.kim@pickth.com
 */
interface BasePresenter {
    fun attachView(view: View, context: Context)
}