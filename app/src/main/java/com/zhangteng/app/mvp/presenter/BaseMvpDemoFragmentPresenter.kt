package com.zhangteng.app.mvp.presenter

import com.zhangteng.app.mvp.model.BaseMvpDemoFragmentModel
import com.zhangteng.app.mvp.model.imodel.IBaseMvpDemoFragmentModel
import com.zhangteng.app.mvp.presenter.ipresenter.IBaseMvpDemoFragmentPresenter
import com.zhangteng.app.mvp.view.IBaseMvpDemoFragmentView
import com.zhangteng.mvp.base.BasePresenter

class BaseMvpDemoFragmentPresenter :
    BasePresenter<IBaseMvpDemoFragmentView, IBaseMvpDemoFragmentModel>(),
    IBaseMvpDemoFragmentPresenter {

    override var mModel: IBaseMvpDemoFragmentModel = BaseMvpDemoFragmentModel()

}