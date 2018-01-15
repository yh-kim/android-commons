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

package com.pickth.commons.example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pickth.commons.example.R
import com.pickth.commons.recyclerview.BaseRecyclerView
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * Created by yonghoon on 2018-01-15
 * Blog   : http://blog.pickth.com
 */

class MainItemAdapter: BaseRecyclerView.BaseAdapter<String>() {
    override fun onBindViewHolder(holder: BaseRecyclerView.BaseViewHolder<String>, position: Int) {
        holder.onBind(arrItems[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseRecyclerView.BaseViewHolder<String> {
        val itemView = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_main, parent, false)

        return MainItemViewHolder(itemView)

    }

    override fun getItemCount(): Int = arrItems.size

    class MainItemViewHolder(view: View): BaseRecyclerView.BaseViewHolder<String>(view) {
        override fun onBind(item: String) {
            with(itemView) {
                tv_item_name.text = item
            }
        }
    }
}