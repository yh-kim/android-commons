package com.pickth.commons.mvp

/**
 * Created by yonghoon on 2017-07-18.
 * Mail   : yonghoon.kim@pickth.com
 */
interface BaseView<T> {
    fun setPresenter(presenter: T)
}