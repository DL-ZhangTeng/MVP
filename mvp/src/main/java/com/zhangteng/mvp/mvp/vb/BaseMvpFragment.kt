package com.zhangteng.mvp.mvp.vb

import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding
import com.zhangteng.base.base.BaseFragment
import com.zhangteng.mvp.base.IModel
import com.zhangteng.mvp.base.IPresenter
import com.zhangteng.mvp.base.IView
import com.zhangteng.utils.ViewBindingUtils

/**
 * 使用Mvp模式Fragment基类
 * Created by swing on 2021/7/3.
 */
abstract class BaseMvpFragment<vb : ViewBinding?, V : IView, M : IModel, P : IPresenter<V, M>> :
    BaseFragment() {

    protected var mBinding: vb? = null
    protected var mPresenter: P? = null

    override fun initView(view: View, savedInstanceState: Bundle?) {
        mBinding = ViewBindingUtils.bind<vb>(this, view)
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