package net.shuzhi.navigationcourse.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_avater_verify.view.*
import net.shuzhi.navigationcourse.R
import net.shuzhi.navigationcourse.base.BaseFragment

/**
 * @author 梁爽
 * @create 2020/11/8 23:00
 */
class AvatarVeifyFragment :BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_avater_verify
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.avatarVerifyButton.setOnClickListener{
            findNavController().navigate(R.id.to_login_page)
        }
    }
}