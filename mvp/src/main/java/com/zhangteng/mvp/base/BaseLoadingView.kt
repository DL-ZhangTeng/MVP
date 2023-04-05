package com.zhangteng.mvp.base

import com.zhangteng.utils.ILoadingView

/**
 * Created by swing on 2019/7/16 0016.
 */
interface BaseLoadingView<T> : IView, ILoadingView {
    fun inflateView(data: T?)
}