package com.zhangteng.app.mvp.presenter

import com.zhangteng.app.mvp.model.imodel.IMainModel
import com.zhangteng.app.mvp.presenter.ipresenter.IMainPresenter
import com.zhangteng.app.mvp.view.IMainView
import com.zhangteng.mvp.base.BaseLoadingPresenter
import javax.inject.Inject

class MainPresenter @Inject constructor() : BaseLoadingPresenter<IMainView, IMainModel>(),
    IMainPresenter {

    @Inject
    override lateinit var mModel: IMainModel

    override fun testString(): String? {
        return mModel?.testString()
    }
}