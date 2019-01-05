package com.peng.wanandroid.base.view

interface BaseView {
    fun showErrorView()
    fun showErrorMsg()
    fun reLoad()
    fun showLoading()
    fun showNormalView()
    fun showDialog()
    fun showToast(toast: String)
    fun disableRefresh()
    fun useNightMode(isNight: Boolean)
    fun setStatusBarColor(isSet: Boolean)
    fun showTipsView(isConnection: Boolean)
}