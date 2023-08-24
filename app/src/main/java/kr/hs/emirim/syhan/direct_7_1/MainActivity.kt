package kr.hs.emirim.syhan.direct_7_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var edit : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}