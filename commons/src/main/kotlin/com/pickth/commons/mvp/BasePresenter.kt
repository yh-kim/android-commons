package com.pickth.commons.mvp

import android.content.Context
import android.view.View

interface BasePresenter {
    fun attachView(view: View, context: Context)
}