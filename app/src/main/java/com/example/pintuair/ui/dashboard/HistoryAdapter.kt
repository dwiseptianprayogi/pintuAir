package com.example.pintuair.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pintuair.databinding.ItemHistoryVerticalBinding
import com.example.pintuair.model.HistoryModel

class HistoryAdapter (
    private val listData : List<HistoryModel>,
    /*private val itemAdapterCallback : ItemAdapterCallback,*/
) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>(){

    inner class ViewHolder(val binding:ItemHistoryVerticalBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHistoryVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

        /*val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_pastorders, parent, false)
        return ViewHolder(view)*/

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        /*holder.bind(listData[position], itemAdapterCallback)*/
        with(holder){
            with(listData[position]){
                binding.tvDate.text = this.CreatedAt
                binding.tvTempVal.text = this.TinggiAir
                binding.tvHumVal.text = this.KelTanah
                binding.tvVoltVal.text = this.ArusAir
                binding.tvKeteranganVal.text = this.Keterangan

                if (StatPintu == "Terbuka"){
                    binding.tvWarning.visibility = View.VISIBLE
                    binding.tvSuccess.visibility = View.GONE
                }
                else if (StatPompa == "Hidup"){
                    binding.tvPompaValHidup.visibility = View.VISIBLE
                    binding.tvPompaValMati.visibility = View.GONE
                }
                else{
                    binding.tvWarning.visibility = View.GONE
                    binding.tvSuccess.visibility = View.VISIBLE

                    binding.tvPompaValHidup.visibility = View.GONE
                    binding.tvPompaValMati.visibility = View.VISIBLE

                }
            }
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    /*class ViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : Data, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvTitle.text = data.food.name
                tvPrice.formatPrice(data.food.price.toString())
                tvDate.text = data.food.createdAt.convertLongToTime("MMM dd , HH.mm")

                Glide.with(context)
                    .load(data.food.picturePath)
                    .into(ivPoster)

                if(data.status.equals("CANCELLED", true)) {
                    tvCancelled.visibility = View.VISIBLE
                }

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }*/

    /*interface ItemAdapterCallback {
        fun onClick(v: View, data:Data)
    }*/

}