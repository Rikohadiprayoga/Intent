package com.example.intent_riko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle = intent.extras
        val nim = bundle?.get("Nim")
        val nama = bundle?.get("Nama")
        val nilai = bundle?.get("Nilai")
        val keterangan = bundle?.get("Keterangan")

        Am_nim.text = ("Nim : " + (nim))
        Am_nama.text = ("Nama : " + (nama))
        Am_nilai.text = ("Nilai : " + (nilai))
        Am_keterangan.text = ("Keterangan Nilai : " + (keterangan))

        btn_kembali.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}







