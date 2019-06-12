package com.tom.demobutton

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isOffline: Boolean=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_change.setOnClickListener {
            if(isOffline){
                isOffline = false
                tv_state.setTextColor(Color.parseColor("Green"))
                tv_state.setText(R.string.online)  //設立字串資源檔 可以用於多國語系
            }else{
                isOffline = true
                tv_state.setTextColor(Color.GRAY)
                tv_state.setText("離線")
            }
        }

    }
}
