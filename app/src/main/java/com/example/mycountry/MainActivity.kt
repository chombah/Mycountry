package com.example.mycountry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view: View) {
        if (Ke.isChecked)text_result.text= "Kenya: We speak English"
        if (Ug.isChecked)text_result.text= "Uganda: They try to speak speak English"
        if (Tz.isChecked)text_result.text= "Tanzania: They should ask Diamond"
    }
    fun onSelect(view: View){
        if (Yes_btn.isChecked)textv.text= "Yes is a certified developer"
        if (No_btn.isChecked)textv.text= "No is not a certified developer"
    }
}