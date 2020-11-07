package net.shuzhi.navigationcourse.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * @author 梁爽
 * @create 2020/11/7 17:13
 */
abstract class BaseFragment :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(getLayoutResId(),container,false)
        initView(rootView)
        return rootView
    }

    open fun initView(rootView: View) {

    }

    abstract fun getLayoutResId(): Int
}