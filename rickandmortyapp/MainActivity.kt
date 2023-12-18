package com.pragadees.rickandmortyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var rickMortyAdapter: RickMortyAdapter
    @Suppress("MissingInflated")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView= findViewById(R.id.recycler_view)
        rickMortyAdapter = RickMortyAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = rickMortyAdapter
        RetrofitData.api.getAllCharacters().enqueue(object : Callback<RickMorty>{
            override fun onResponse(call: Call<RickMorty>, response: Response<RickMorty>) {
                rickMortyAdapter.setData(response.body()!!.results)
            }
            override fun onFailure(call: Call<RickMorty>, t: Throwable) {
                Log.d("TAG","onFailure: ${t.message}")
            }

        })


    }
}