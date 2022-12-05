package com.zhangteng.mvp.mvp

import android.os.Bundle
import android.view.View
import com.zhangteng.base.base.BaseAdapter
import com.zhangteng.base.base.BaseListFragment
import com.zhangteng.mvp.base.IModel
import com.zhangteng.mvp.base.IPresenter
import com.zhangteng.mvp.base.IView

/**
 * 使用Mvp模式Fragment基类
 * Created by swing on 2021/7/3.
 */
abstract class BaseListMvpFragment<V : IView, M : IModel, P : IPresenter<V, M>, D, VH : BaseAdapter.DefaultViewHolder, A : BaseAdapter<D, VH>> :
    BaseListFragment<D, VH, A>() {

    protected var mPresenter: P? = null

    override fun initView(view: View, savedInstanceState: Bundle?) {
        super.initView(view, savedInstanceState)
        mPresenter = createPresenter()
        mPresenter?.attachView(this as V)
        mPresenter?.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
        mPresenter?.onDestroy()
        mPresenter = null
    }

    /**
     * 子类提供实现
     * 创建对应页面的presenter
     */
    abstract fun createPresenter(): P?
}