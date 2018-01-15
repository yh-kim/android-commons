/*
 * Copyright 2017 Yonghoon Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pickth.commons.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.pickth.commons.view.fragments.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment: BaseFragment(), MainContract.View {

    private lateinit var mTvMainText: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_main, container, false)

        mTvMainText = rootView.tv_main_text

        var presenter = MainPresenter()
                .apply {
                    attachView(this@MainFragment)
                    test()
                }

        return rootView
    }

    override fun start() {
    }

    override fun showText(msg: String) {
        mTvMainText.text = msg
    }

}