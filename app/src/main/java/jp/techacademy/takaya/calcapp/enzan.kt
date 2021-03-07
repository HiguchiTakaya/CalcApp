package jp.techacademy.takaya.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_enzan.*

class enzan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enzan)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val operation = intent.getIntExtra("OPERATION", 0)

        if(operation == 1){
            textView.text = "${value1 + value2}"
        } else if(operation == 2){
            textView.text = "${value1 - value2}"
        }
    }
}