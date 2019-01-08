package com.peng.wanandroid.base.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import butterknife.ButterKnife
import butterknife.Unbinder

import com.peng.wanandroid.base.view.BaseView

abstract class BaseActivity : AppCompatActivity(), BaseView {
    private val mTipsView: TextView? = null
    protected var mIsEnableTip: Boolean? = null
    private lateinit var mUnbinder : Unbinder
    protected abstract fun getLayoutId(): Int
    protected abstract fun initView()
    protected abstract fun initData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        mUnbinder = ButterKnife.bind(this)
        initView()
        initData()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mUnbinder.unbind()
    }

    override fun showErrorView() {

    }

    override fun showErrorMsg() {

    }

    override fun reLoad() {

    }

    override fun showLoading() {

    }

    override fun showNormalView() {

    }

    override fun showDialog() {

    }

    override fun showToast(toast: String) {

    }

    override fun disableRefresh() {

    }

    override fun useNightMode(isNight: Boolean) {

    }

    override fun setStatusBarColor(isSet: Boolean) {

    }

    override fun showTipsView(isConnection: Boolean) {

    }
}
