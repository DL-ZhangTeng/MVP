package com.zhangteng.mvp.base

import android.view.View
import com.zhangteng.utils.IStateView

/**
 * 无网络/无数据
 * Created by swing on 2019/7/25 0025.
 */
interface BaseStateView<T> : BaseLoadingView<T?>, IStateView {
    /**
     * description 获取被替换的View
     */
    fun getContentView(): View?
}