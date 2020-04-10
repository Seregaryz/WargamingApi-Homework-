package com.kpfu.itis.encyclopediaoftanks.presentation.view.list

import androidx.recyclerview.widget.DiffUtil
import com.kpfu.itis.encyclopediaoftanks.data.model.X1
import com.kpfu.itis.encyclopediaoftanks.domain.model.TankModel

class TankDiffUtil(
    private var oldItems: List<TankModel>,
    private var newItems: List<TankModel>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldItems.size

    override fun getNewListSize(): Int = newItems.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItems[oldItemPosition].tankId == newItems[newItemPosition].tankId
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItems[oldItemPosition] == newItems[newItemPosition]
    }
}