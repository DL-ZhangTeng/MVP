package com.zhangteng.mvp.mvp.vb

import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding
import com.zhangteng.mvp.base.IModel
import com.zhangteng.mvp.base.IPresenter
import com.zhangteng.mvp.base.IView
import com.zhangteng.mvp.mvp.BaseMvpFragment
import com.zhangteng.utils.ViewBindingUtils

/**
 * 使用Mvp模式Fragment基类
 * Created by swing on 2021/7/3.
 */
abstract class BaseMvpFragment<vb : ViewBinding?, V : IView, M : IModel, P : IPresenter<V, M>> :
    BaseMvpFragment<V, M, P>() {

    protected var mBinding: vb? = null

    override fun initView(view: View, savedInstanceState: Bundle?) {
        mBinding = ViewBindingUtils.bind<vb>(this, view)
        super.initView(view, savedInstanceState)
    }
}