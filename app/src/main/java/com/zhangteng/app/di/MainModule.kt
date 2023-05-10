package com.zhangteng.app.di

import com.zhangteng.app.mvp.model.MainModel
import com.zhangteng.app.mvp.model.imodel.IMainModel
import com.zhangteng.app.mvp.presenter.MainPresenter
import com.zhangteng.app.mvp.presenter.ipresenter.IMainPresenter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class MainModule {

    @Binds
    abstract fun bindMainPresenter(mainPresenter: MainPresenter): IMainPresenter

    @Binds
    abstract fun bindMMainModule(mainModel: MainModel): IMainModel

}
