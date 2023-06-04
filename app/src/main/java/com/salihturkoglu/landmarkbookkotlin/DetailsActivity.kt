package com.salihturkoglu.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salihturkoglu.landmarkbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent=intent
        val selectedKent=intent.getSerializableExtra("kent",)as KentBilgileri
        binding.kentText.text=selectedKent.country
        binding.simgeNameText.text=selectedKent.name
        binding.imageView.setImageResource(selectedKent.image)
    }
}