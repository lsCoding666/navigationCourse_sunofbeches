package net.shuzhi.navigationcourse.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.view.*
import net.shuzhi.navigationcourse.R
import net.shuzhi.navigationcourse.base.BaseFragment
/**
 * @author 梁爽
 * @create 2020/11/7 17:16
 */
class LoginFragment :BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_login
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toRegisterPageBtn.setOnClickListener {
            //跳转到注册界面
            findNavController().navigate(R.id.to_register_fragment)
        }
        rootView.toForgetPageBtn.setOnClickListener {
            //跳转到忘记密码界面
            findNavController().navigate(R.id.to_forget_fragment)
        }
    }
}