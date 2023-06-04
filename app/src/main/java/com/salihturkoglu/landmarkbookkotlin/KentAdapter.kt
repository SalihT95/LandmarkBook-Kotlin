package com.salihturkoglu.landmarkbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.salihturkoglu.landmarkbookkotlin.databinding.RecyclerRowBinding

class KentAdapter(val kentListesi: ArrayList<KentBilgileri>):RecyclerView.Adapter<KentAdapter.KentHolder>() {

    class KentHolder(val binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KentHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return KentHolder(binding)
    }

    override fun onBindViewHolder(holder: KentHolder, position: Int) {
        holder.binding.textViewRcy.text= kentListesi.get(position).name
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("kent",kentListesi.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return kentListesi.size
    }
}
