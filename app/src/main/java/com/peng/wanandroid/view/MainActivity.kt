package com.peng.wanandroid.view

import android.os.Bundle

import com.google.android.material.bottomnavigation.BottomNavigationView
import com.peng.wanandroid.base.activity.BaseActivity
import butterknife.BindView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.peng.wanandroid.R

class MainActivity : BaseActivity() {
    @BindView(R.id.fab_up) lateinit var fabUp : FloatingActionButton

    @BindView(R.id.bnv_btm) lateinit var mBottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBottomNavigationView.selectedItemId = R.id.item_home
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        mBottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item_home -> {

                }
                R.id.item_hierarchy -> {
                }
                R.id.item_wechat -> {
                }
                R.id.item_project -> {
                }
                R.id.item_mine -> {
                }
                else -> {
                }
            }
            true
        }
    }

    override fun initData() {

    }
}
