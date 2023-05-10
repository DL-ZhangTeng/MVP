package com.zhangteng.app.mvp.presenter

import com.zhangteng.app.mvp.model.BaseMvpDemoModel
import com.zhangteng.app.mvp.model.imodel.IBaseMvpDemoModel
import com.zhangteng.app.mvp.presenter.ipresenter.IBaseMvpDemoPresenter
import com.zhangteng.app.mvp.view.IBaseMvpDemoView
import com.zhangteng.mvp.base.BasePresenter

class BaseMvpDemoPresenter : BasePresenter<IBaseMvpDemoView, IBaseMvpDemoModel>(),
    IBaseMvpDemoPresenter {

    override var mModel: IBaseMvpDemoModel = BaseMvpDemoModel()

}