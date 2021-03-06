package net.shuzhi.navigationcourse.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_register.view.*
import net.shuzhi.navigationcourse.R
import net.shuzhi.navigationcourse.base.BaseFragment

/**
 * @author 梁爽
 * @create 2020/11/7 17:16
 */
class RegisterFragment :BaseFragment(){
    override fun getLayoutResId(): Int {
        return R.layout.fragment_register
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toAvatarVerify.setOnClickListener {
            findNavController().navigate(R.id.to_verify_fragment)
        }
    }
}