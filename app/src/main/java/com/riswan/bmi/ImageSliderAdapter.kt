package com.riswan.bmi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageSliderAdapter(private val imageSliders: List<ImageSlider>): RecyclerView.Adapter<ImageSliderAdapter.ImageSliderViewHolder>() {

    inner class ImageSliderViewHolder(view:View): RecyclerView.ViewHolder (view){
        private val textGender = view.findViewById<TextView>(R.id.txt_gender)
        private val imageIcon = view.findViewById<ImageView>(R.id.image_slide_icon)

        fun bind(imageSlider: ImageSlider) {
            textGender.text = imageSlider.gender
            imageIcon.setImageResource(imageSlider.icon)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageSliderViewHolder {
        return ImageSliderViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.slide_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImageSliderViewHolder, position: Int) {
        return holder.bind(imageSliders[position])
    }

    override fun getItemCount(): Int {
        return imageSliders.size
    }
}