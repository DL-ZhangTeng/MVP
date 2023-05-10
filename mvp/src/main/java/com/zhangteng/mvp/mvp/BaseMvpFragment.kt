package com.zhangteng.mvp.mvp

import android.os.Bundle
import android.view.View
import com.zhangteng.base.base.BaseFragment
import com.zhangteng.mvp.base.IModel
import com.zhangteng.mvp.base.IPresenter
import com.zhangteng.mvp.base.IView

/**
 * 使用Mvp模式Fragment基类
 * Created by swing on 2021/7/3.
 */
abstract class BaseMvpFragment<V : IView, M : IModel, P : IPresenter<V, M>> : BaseFragment() {

    abstract var mPresenter: P

    override fun initView(view: View, savedInstanceState: Bundle?) {
        mPresenter.attachView(this as V)
        mPresenter.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
        mPresenter.onDestroy()
    }
}