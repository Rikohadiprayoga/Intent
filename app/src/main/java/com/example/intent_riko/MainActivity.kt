package com.example.intent_riko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Am_nim = findViewById<EditText>(R.id.Am_nim)
        val Am_nama = findViewById<EditText>(R.id.Am_nama)
        val Am_nilai = findViewById<EditText>(R.id.Am_nilai)

        Am_proses.setOnClickListener(){
            if((Am_nim.text.isEmpty())||(Am_nama.text.isEmpty())||(Am_nilai.text.isEmpty())){
                Toast.makeText(applicationContext,"wajib di isi", Toast.LENGTH_LONG).show()
            }else if ((Am_nim.text.isEmpty())||(Am_nama.text.isNotEmpty())||(Am_nilai.text.isNotEmpty())){
                Toast.makeText(applicationContext,"INPUT", Toast.LENGTH_LONG).show()

                val nim = Am_nim.text.toString()
                val nama = Am_nama.text.toString()
                val nilai =Am_nilai.text.toString()
                var keterangan: String? = ""

                if (nilai >= 80.toString()){
                    keterangan = "A"
                }else if(nilai >= 60.toString()){
                    keterangan = "B"
                }else if(nilai >= 40.toString()){
                    keterangan = "C"
                }else if (nilai >=20.toString()){
                    keterangan = "D"
                }else{
                    keterangan = "E"
                }

                val intent = Intent(this, Main2Activity::class.java)
                intent.putExtra("Nim", nim)
                intent.putExtra("Nama", nama)
                intent.putExtra("Nilai", nilai)
                intent.putExtra("Keterangan", keterangan)

                startActivity(intent)
            }
        }
    }
}






