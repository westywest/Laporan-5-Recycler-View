package com.maharanid17.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.maharanid17.latihanrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: MyContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("20102013", "Maharani Dian Prawesty", "088434129129"),
            MyContact("20193811", "Saputri", "087618128231"),
            MyContact("27191283", "Bima Purnomo", "082173666617"),
            MyContact("21931022", "Joko Dodo", "08137181191"),
            MyContact("19827635", "Muhammad Ramdan", "089716257726"),
            MyContact("18736171", "Kartika Sari", "087371899800"),
            MyContact("20111112", "Safriel Saputra", "082839191111"),
            MyContact("21183719", "Anom Dewi", "082781729001"),
            MyContact("21839299", "Fadilah tiyana", "082717390200"),
            MyContact("20918747", "Malik", "085627188819"),
            MyContact("19283933", "Gofari Andrian", "0876383911029"),
            MyContact("21039382", "Firmansyah", "081287493748"),

        )

        adapter = MyContactAdapter(listStudent)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}