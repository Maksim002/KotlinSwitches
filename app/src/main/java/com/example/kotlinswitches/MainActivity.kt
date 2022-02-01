package com.example.kotlinswitches

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suke.widget.SwitchButton
import kotlinx.android.synthetic.main.activity_main.*


//https://github.com/zcweng/SwitchButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch_button.setOnCheckedChangeListener(SwitchButton.OnCheckedChangeListener { view, isChecked ->
            var l = isChecked
            l
        })
    }
}