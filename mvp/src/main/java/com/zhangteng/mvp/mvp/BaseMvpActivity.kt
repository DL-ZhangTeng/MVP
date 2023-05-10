package com.zhangteng.mvp.mvp

import com.zhangteng.base.base.BaseActivity
import com.zhangteng.mvp.base.IModel
import com.zhangteng.mvp.base.IPresenter
import com.zhangteng.mvp.base.IView

/**
 * 使用Mvp模式Activity基类
 * Created by swing on 2017/11/23.
 */
abstract class BaseMvpActivity<V : IView, M : IModel, P : IPresenter<V, M>> : BaseActivity() {

    abstract var mPresenter: P

    override fun initView() {
        mPresenter.attachView(this as V)
        mPresenter.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
        mPresenter.onDestroy()
    }
}