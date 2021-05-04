package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView= findViewById<ListView>(R.id.listView)
        var list= mutableListOf<Model>()


        //adding images
        list.add(Model("Facebook","facebook description",R.drawable.facebook))
        list.add(Model("Whatsapp","Whatsapp description",R.drawable.whatsapp))
        list.add(Model("Youtube","youtube description",R.drawable.youtube))
        list.add(Model("Instagram","instagram description",R.drawable.instagram1))
        list.add(Model("Twitter","Twitter description",R.drawable.twitter))

        listView.adapter=MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->

            if (position==0){
                Toast.makeText(this@MainActivity,"You have clicked on Facecebook!",Toast.LENGTH_LONG).show()

            }
            if (position==1){
                Toast.makeText(this@MainActivity,"You have clicked on Whatsapp!",Toast.LENGTH_LONG).show()

            }
            if (position==2){
                Toast.makeText(this@MainActivity,"You have clicked on Youtube!",Toast.LENGTH_LONG).show()

            }
            if (position==3){
                Toast.makeText(this@MainActivity,"You have clicked on Instagram!",Toast.LENGTH_LONG).show()

            }
            if (position==4){
                Toast.makeText(this@MainActivity,"You have clicked on Twitter!",Toast.LENGTH_LONG).show()

            }



        }
    }
}