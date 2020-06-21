package kr.co.namu.intentpractice_20200621

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstActivityBtn.setOnClickListener {
            val myIntent = Intent(this, FirstActivity::class.java)

            //실제 인텐트 사용 --> 비행기 탑승 (출발)
            startActivity(myIntent)


        }

        secondActivityBtn.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }
    }
}