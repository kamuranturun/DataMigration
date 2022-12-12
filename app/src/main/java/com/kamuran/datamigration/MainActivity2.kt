package com.kamuran.datamigration

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tvDeger:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvDeger=findViewById(R.id.textView)

        var gelenDeger= intent.getStringExtra("deger")
       tvDeger.text=gelenDeger
    }

    fun geriGit(view: View) {
        var i= Intent()//burda yeni ekran oluşturmuyoruz sadece geri gidiyoruz geldiğimiz yere gidiyoruz
            i.putExtra("geriDeger","geri gönderilen deger")
        setResult(Activity.RESULT_OK,i)
        finish()
    }
}