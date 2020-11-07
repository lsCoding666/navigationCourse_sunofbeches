package net.shuzhi.navigationcourse.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_forget.view.*
import net.shuzhi.navigationcourse.R
import net.shuzhi.navigationcourse.base.BaseFragment

/**
 * @author 梁爽
 * @create 2020/11/7 17:17
 */
class ForgetFragment :BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_forget
    }

    override fun initView(rootView: View) {
        rootView.backBtnView.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}