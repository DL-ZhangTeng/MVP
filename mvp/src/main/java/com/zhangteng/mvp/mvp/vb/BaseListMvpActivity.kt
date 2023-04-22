package com.zhangteng.mvp.mvp.vb

import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.zhangteng.base.base.BaseAdapter
import com.zhangteng.mvp.base.IModel
import com.zhangteng.mvp.base.IPresenter
import com.zhangteng.mvp.base.IView
import com.zhangteng.mvp.mvp.BaseListMvpActivity
import com.zhangteng.utils.ViewBindingUtils

/**
 * 使用Mvp模式Activity基类
 * Created by swing on 2017/11/23.
 */
abstract class BaseListMvpActivity<vb : ViewBinding?, V : IView, M : IModel, P : IPresenter<V, M>, D, VH : BaseAdapter.DefaultViewHolder, A : BaseAdapter<D, VH>> :
    BaseListMvpActivity<V, M, P, D, VH, A>() {

    protected var mBinding: vb? = null

    override fun setContentView(view: View?) {
        mBinding = view?.let { ViewBindingUtils.bind<vb>(this, it) }
        super.setContentView(mBinding?.root ?: view)
    }

    override fun setContentView(view: View?, params: ViewGroup.LayoutParams?) {
        mBinding = view?.let { ViewBindingUtils.bind<vb>(this, it) }
        super.setContentView(mBinding?.root ?: view, params)
    }

    override fun setContentView(layoutResID: Int) {
        mBinding = ViewBindingUtils.inflate<vb>(this)
        super.setContentView(mBinding?.root ?: layoutInflater.inflate(layoutResID, null))
    }
}