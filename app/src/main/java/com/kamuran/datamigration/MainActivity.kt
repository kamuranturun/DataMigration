package com.kamuran.datamigration

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun yeniEkranAc(view: View) {
        var intent= Intent(this,MainActivity2::class.java)
        intent.putExtra("deger","Gönderilen değer") //string gönderme
       // startActivity(intent) bu normal veri taşıma
        startActivityForResult(intent,0) //burda ise geri gelince neler yapabiliriz işlemini yakalarız
    }

    //yakalama işlemi
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==0 && resultCode== Activity.RESULT_OK)
        {
            var str= data?.getStringExtra("geriDeger")
            //geri deger gönderme
            Toast.makeText(this,str,Toast.LENGTH_LONG).show()
        }
    }
}