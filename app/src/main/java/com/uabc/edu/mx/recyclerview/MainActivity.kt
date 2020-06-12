package com.uabc.edu.mx.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val myDataSet = arrayOf(
            "PHP",
            "Javascript",
            "Go",
            "Python"
    )

    private val mAdapter by lazy {
        MyAdapter(myDataSet)
    }

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        recyclerView.setHasFixedSize(true)

        val layoutManager = LinearLayoutManager(baseContext)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = mAdapter
    }
}
