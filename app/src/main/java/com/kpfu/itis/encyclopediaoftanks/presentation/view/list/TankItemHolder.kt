package com.kpfu.itis.encyclopediaoftanks.presentation.view.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kpfu.itis.encyclopediaoftanks.R
import com.kpfu.itis.encyclopediaoftanks.data.model.X1
import com.kpfu.itis.encyclopediaoftanks.domain.model.TankModel
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.tank_item.view.*

class TankItemHolder(
    override val containerView: View,
    private val clickLambda: (Int) -> Unit
) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(tank: TankModel) {
        containerView.apply {
            tv_name.text = tank.name
            tv_hp.text = tank.hp
            itemView.setOnClickListener {
                clickLambda(tank.tankId)
            }
        }
    }

    fun updateFromBundle(bundle: Bundle?) {
        containerView.apply {
            bundle?.apply {
                tv_name.text = getString(KEY_NAME)
                tv_hp.text = getString(KEY_HP)
            }
        }
    }

    companion object {
        const val KEY_NAME = "name"
        const val KEY_HP = "hp"
        fun create(parent: ViewGroup, clickLambda: (Int) -> Unit) =
            TankItemHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.tank_item, parent, false),
                clickLambda
            )
    }
}
