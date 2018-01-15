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

package com.pickth.commons.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import java.util.ArrayList

/**
 * Created by yonghoon on 2018-01-15
 * Blog   : http://blog.pickth.com
 */

class BaseRecyclerView {

    abstract class BaseAdapter<ITEM>: RecyclerView.Adapter<BaseRecyclerView.BaseViewHolder<ITEM>>() {
        protected var arrItems = ArrayList<ITEM>()

        fun getItems(): ArrayList<ITEM> = arrItems

        fun getItem(position: Int) = arrItems[position]

        fun addItemAtLast(item: ITEM) {
            arrItems.add(itemCount, item)
        }

        fun addItem(item: ITEM) {
            arrItems.add(item)
        }
    }

    abstract class BaseViewHolder<ITEM>(view: View): RecyclerView.ViewHolder(view) {
        abstract fun onBind(item: ITEM)
    }
}