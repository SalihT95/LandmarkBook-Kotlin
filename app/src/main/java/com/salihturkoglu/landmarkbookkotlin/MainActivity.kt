package com.salihturkoglu.landmarkbookkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.salihturkoglu.landmarkbookkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var kentliste: ArrayList<KentBilgileri>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        kentliste=ArrayList<KentBilgileri>()

        val pisa = KentBilgileri("Pisa","Italy",R.drawable.pisa)
        val uzungol = KentBilgileri("Uzun Göl","Trabzon",R.drawable.uzungol)
        val kizkulesi = KentBilgileri("Kız Kulesi","Istanbul",R.drawable.kizkulesi)
        val eyfel = KentBilgileri("Eyfel Kulesi","Paris",R.drawable.eyfel)
        val coolosseum = KentBilgileri("Coolosseum","Italy",R.drawable.coolosseum)



        kentliste.add(pisa)
        kentliste.add(uzungol)
        kentliste.add(kizkulesi)
        kentliste.add(eyfel)
        kentliste.add(coolosseum)

        //RecyclerView
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val kentAdapter= KentAdapter(kentliste)
        binding.recyclerView.adapter= kentAdapter




    }
}