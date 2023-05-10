package com.zhangteng.mvp.base

import java.lang.ref.WeakReference

abstract class BasePresenter<V : IView, M : IModel> : IPresenter<V, M> {

    protected var mView: WeakReference<V?>? = null

    abstract var mModel: M

    override fun attachView(view: V?) {
        if (!isAttach()) {
            this.mView = WeakReference(view)
        }
    }

    override fun detachView() {
        if (isAttach()) {
            mView?.clear()
            mView = null
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mModel.onDestroy()
    }

    override fun isAttach(): Boolean {
        return mView != null &&
                mView!!.get() != null
    }
}