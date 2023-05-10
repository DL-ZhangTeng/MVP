package com.zhangteng.app.mvp.presenter

import com.zhangteng.app.mvp.model.BaseListMvpDemoModel
import com.zhangteng.app.mvp.model.imodel.IBaseListMvpDemoModel
import com.zhangteng.app.mvp.presenter.ipresenter.IBaseListMvpDemoPresenter
import com.zhangteng.app.mvp.view.IBaseListMvpDemoView
import com.zhangteng.mvp.base.BasePresenter

class BaseListMvpDemoPresenter : BasePresenter<IBaseListMvpDemoView, IBaseListMvpDemoModel>(),
    IBaseListMvpDemoPresenter {

    override var mModel: IBaseListMvpDemoModel = BaseListMvpDemoModel()

}