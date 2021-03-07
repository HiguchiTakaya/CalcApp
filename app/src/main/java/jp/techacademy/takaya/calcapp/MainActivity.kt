package jp.techacademy.takaya.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val intent = Intent(this, enzan::class.java)
        if (v.id == R.id.button1) {
            intent.putExtra("VALUE1", editText.text)
            intent.putExtra("VALUE2", editText2.text)
            intent.putExtra("OPERATION", 1)//plus
            startActivity(intent)
        } else if (v.id == R.id.button2) {
            intent.putExtra("VALUE1", editText.text)
            intent.putExtra("VALUE2", editText2.text)
            intent.putExtra("OPERATION", 2)//minus
            startActivity(intent)
        }
    }
}