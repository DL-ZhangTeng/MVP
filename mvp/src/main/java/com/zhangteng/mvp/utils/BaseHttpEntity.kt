package com.zhangteng.mvp.utils

import com.zhangteng.mvp.base.BaseLoadingView
import com.zhangteng.mvp.base.BaseRefreshView
import com.zhangteng.mvp.base.BaseStateView
import com.zhangteng.mvp.base.IView

/**
 * model到presenter的回调
 * Created by swing on 2019/7/2 0002.
 */
abstract class BaseHttpEntity<T> {
    private var iView: IView? = null

    constructor()
    constructor(iView: IView?) {
        this.iView = iView
    }

    /**
     * 请求开始
     */
    open fun onStart() {
        if (iView != null && iView is BaseLoadingView<*>) (iView as BaseLoadingView<*>?)?.showProgressDialog()
    }

    abstract fun onSuccess(data: T?)

    /**
     * 无网络
     */
    open fun onNoNetworkError() {
        if (iView != null && iView is BaseStateView<*>)
            (iView as BaseStateView<*>?)
                ?.showNoNetView(
                    (iView as BaseStateView<*>?)
                        ?.getContentView()
                )
    }

    /**
     * 业务异常处理
     */
    open fun onError(code: Int, error: String?) {}

    /**
     * http异常处理
     */
    open fun onHttpError(code: Int, error: String?) {}

    /**
     * 请求完成
     */
    open fun onFinish() {
        if (iView != null && iView is BaseStateView<*>)
            (iView as BaseStateView<*>?)
                ?.showContentView(
                    (iView as BaseStateView<*>?)
                        ?.getContentView()
                )
        if (iView != null && iView is BaseRefreshView<*>) (iView as BaseRefreshView<*>?)?.finishRefreshOrLoadMore()
        if (iView != null && iView is BaseLoadingView<*>) (iView as BaseLoadingView<*>?)?.dismissProgressDialog()
    }
}