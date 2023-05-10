package com.zhangteng.app.mvp.model

import com.zhangteng.app.mvp.model.imodel.IMainModel
import com.zhangteng.mvp.base.BaseModel
import javax.inject.Inject

class MainModel @Inject constructor() : BaseModel(), IMainModel {
    override fun testString(): String? {
        return "test"
    }
}