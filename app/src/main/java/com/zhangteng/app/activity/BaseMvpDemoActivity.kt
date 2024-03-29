package com.zhangteng.app.activity

import android.os.Bundle
import com.zhangteng.app.R
import com.zhangteng.app.mvp.model.imodel.IBaseMvpDemoModel
import com.zhangteng.app.mvp.presenter.BaseMvpDemoPresenter
import com.zhangteng.app.mvp.presenter.ipresenter.IBaseMvpDemoPresenter
import com.zhangteng.app.mvp.view.IBaseMvpDemoView
import com.zhangteng.mvp.mvp.BaseMvpActivity

class BaseMvpDemoActivity :
    BaseMvpActivity<IBaseMvpDemoView, IBaseMvpDemoModel, IBaseMvpDemoPresenter>(),
    IBaseMvpDemoView {

    override var mPresenter: IBaseMvpDemoPresenter = createPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_mvp_demo)
    }

    fun createPresenter(): IBaseMvpDemoPresenter {
        return BaseMvpDemoPresenter()
//        return Proxy.newProxyInstance(
//            BaseMvpDemoPresenter::class.java.classLoader,
//            arrayOf(IBaseMvpDemoPresenter::class.java),
//            LoadingPresenterHandler(BaseMvpDemoPresenter())
//        ) as IBaseMvpDemoPresenter
    }

    override fun initView() {
        super.initView()

    }

    override fun initData() {

    }
}