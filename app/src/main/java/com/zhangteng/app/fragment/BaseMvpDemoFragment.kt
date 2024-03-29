package com.zhangteng.app.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zhangteng.app.R
import com.zhangteng.app.mvp.model.imodel.IBaseMvpDemoFragmentModel
import com.zhangteng.app.mvp.presenter.BaseMvpDemoFragmentPresenter
import com.zhangteng.app.mvp.presenter.ipresenter.IBaseMvpDemoFragmentPresenter
import com.zhangteng.app.mvp.view.IBaseMvpDemoFragmentView
import com.zhangteng.mvp.mvp.BaseMvpFragment

class BaseMvpDemoFragment :
    BaseMvpFragment<IBaseMvpDemoFragmentView, IBaseMvpDemoFragmentModel, IBaseMvpDemoFragmentPresenter>(),
    IBaseMvpDemoFragmentView {

    override var mPresenter: IBaseMvpDemoFragmentPresenter = createPresenter()

    companion object {
        fun newInstance() = BaseMvpDemoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutInflater.from(context)
            .inflate(R.layout.fragment_base_mvp_demo, container, false)
    }

    /**
     *return Proxy.newProxyInstance(BaseMvpDemoFragmentPresenter::class.java.classLoader, arrayOf(IBaseMvpDemoFragmentPresenter::class.java), LoadingPresenterHandler(BaseMvpDemoFragmentPresenter())) as IBaseMvpDemoFragmentPresenter
     */
    fun createPresenter(): IBaseMvpDemoFragmentPresenter {
        return BaseMvpDemoFragmentPresenter()
    }

    override fun initView(view: View, savedInstanceState: Bundle?) {
        super.initView(view, savedInstanceState)

    }

    override fun initData(savedInstanceState: Bundle?) {

    }
}