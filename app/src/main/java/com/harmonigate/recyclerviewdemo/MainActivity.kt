package com.harmonigate.recyclerviewdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.harmonigate.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var userList: ArrayList<String> = ArrayList()  // Initialize userList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fetchUser()
        binding.rvUsers.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            hasFixedSize()
            adapter=UserAdapter(userList)

        }

    }
    fun fetchUser(){
        userList.add("Mukesh")
        userList.add("Bikash")
        userList.add("Prakash")
        userList.add("Aloke")
        userList.add("Misti")
        userList.add("Rakesh")
        userList.add("Paras")
        userList.add("Soumya")
    }
}