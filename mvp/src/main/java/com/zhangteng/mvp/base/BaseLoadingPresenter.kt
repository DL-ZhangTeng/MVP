package com.zhangteng.mvp.base

abstract class BaseLoadingPresenter<V : BaseLoadingView<*>, M : IModel> : BasePresenter<V, M>() {
    open fun getBaseLoadingView(): V? {
        return if (isAttach()) {
            mView?.get()
        } else {
            null
        }
    }
}