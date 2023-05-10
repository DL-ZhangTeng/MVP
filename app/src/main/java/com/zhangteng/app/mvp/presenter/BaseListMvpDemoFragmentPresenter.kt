package com.zhangteng.app.mvp.presenter

import com.zhangteng.app.mvp.model.BaseListMvpDemoFragmentModel
import com.zhangteng.app.mvp.model.imodel.IBaseListMvpDemoFragmentModel
import com.zhangteng.app.mvp.presenter.ipresenter.IBaseListMvpDemoFragmentPresenter
import com.zhangteng.app.mvp.view.IBaseListMvpDemoFragmentView
import com.zhangteng.mvp.base.BasePresenter

class BaseListMvpDemoFragmentPresenter :
    BasePresenter<IBaseListMvpDemoFragmentView, IBaseListMvpDemoFragmentModel>(),
    IBaseListMvpDemoFragmentPresenter {

    override var mModel: IBaseListMvpDemoFragmentModel = BaseListMvpDemoFragmentModel()

}