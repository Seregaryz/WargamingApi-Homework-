package com.kpfu.itis.encyclopediaoftanks.presentation.view.list

import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.kpfu.itis.encyclopediaoftanks.data.model.X1
import com.kpfu.itis.encyclopediaoftanks.domain.model.TankModel
import com.kpfu.itis.encyclopediaoftanks.presentation.view.list.TankItemHolder.Companion.KEY_HP
import com.kpfu.itis.encyclopediaoftanks.presentation.view.list.TankItemHolder.Companion.KEY_NAME

class TankAdapter(
    var clickLambda: (Int) -> Unit
): ListAdapter<TankModel, TankItemHolder>(object : DiffUtil.ItemCallback<TankModel>(){

    override fun areItemsTheSame(oldItem: TankModel, newItem: TankModel): Boolean = oldItem.tankId == newItem.tankId

    override fun areContentsTheSame(oldItem: TankModel, newItem: TankModel): Boolean = oldItem == newItem

    override fun getChangePayload(oldItem: TankModel, newItem: TankModel): Any? {
        val diffBundle = Bundle()
        if (oldItem.name !== newItem.name) {
            diffBundle.putString(KEY_NAME, newItem.name)
        }
        if (oldItem.hp != newItem.hp) {
            diffBundle.putString(KEY_HP, newItem.hp)
        }
        return if (diffBundle.isEmpty) null else diffBundle
    }
}) {

    override fun onBindViewHolder(holder: TankItemHolder, position: Int) =
        holder.bind(getItem(position))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TankItemHolder =
        TankItemHolder.create(
            parent,
            clickLambda
        )

    override fun onBindViewHolder(
        holder: TankItemHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        if (payloads.isEmpty())
            super.onBindViewHolder(holder, position, payloads)
        else {
            val bundle = payloads[0] as? Bundle
            holder.updateFromBundle(bundle)
        }
    }

//    private fun updateList(newList: List<TankDto>) {
//        val result = DiffUtil.calculateDiff(
//            TankDiffUtil(
//                dataSource,
//                newList
//            ), true
//        )
//        result.dispatchUpdatesTo(this)
//        val temp = dataSource.toMutableList()
//        temp.clear()
//        temp.addAll(newList)
//        dataSource = temp.toList()
//  }
}
