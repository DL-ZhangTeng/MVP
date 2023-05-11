package com.zhangteng.app

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import com.zhangteng.aop.annotation.CheckNet
import com.zhangteng.aop.annotation.Permissions
import com.zhangteng.aop.annotation.SingleClick
import com.zhangteng.aop.annotation.TimeLog
import com.zhangteng.app.activity.BaseDemoActivity
import com.zhangteng.app.activity.NineImageActivity
import com.zhangteng.app.activity.TabLayoutActivity
import com.zhangteng.app.activity.TreeActivity
import com.zhangteng.app.databinding.ActivityMainBinding
import com.zhangteng.app.mvp.model.imodel.IMainModel
import com.zhangteng.app.mvp.presenter.ipresenter.IMainPresenter
import com.zhangteng.app.mvp.view.IMainView
import com.zhangteng.mvp.mvp.vb.BaseMvpActivity
import com.zhangteng.utils.StateViewHelper
import com.zhangteng.utils.jumpToActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseMvpActivity<ActivityMainBinding, IMainView, IMainModel, IMainPresenter>(),
    IMainView {

    @Inject
    override lateinit var mPresenter: IMainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun initView() {
        super.initView()

    }

    override fun initData() {
        showToast(mPresenter.testString())
    }

    override fun getContentView(): View? {
        return mBinding?.tvTextView
    }

    override fun inflateView(data: String?) {

    }

    @TimeLog
    @CheckNet
    @SingleClick
    @Permissions(value = ["android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"])
    fun onClickBaseLayout(v: View) {
        jumpToActivity<BaseDemoActivity>()
    }

    @TimeLog
    fun onClickTabLayout(v: View) {
        jumpToActivity<TabLayoutActivity>()
    }

    @TimeLog
    fun onClickTree(v: View) {
        jumpToActivity<TreeActivity>()
    }

    @TimeLog
    fun onClickNineImage(v: View) {
        jumpToActivity<NineImageActivity>()
    }
}