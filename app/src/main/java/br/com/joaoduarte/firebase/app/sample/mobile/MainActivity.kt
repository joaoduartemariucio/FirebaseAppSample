package br.com.joaoduarte.firebase.app.sample.mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pegarValores(view: View) {

        txt_nome.text = edt_nome.text
        txt_sobrenome.text = edt_sobrenome.text
        txt_idade.text = edt_idade.text

        Toast.makeText(this,"Seus dados foram pegos com sucesso", Toast.LENGTH_LONG)
    }

    fun fecharApp(view: View) {
        throw RuntimeException("Test Crash")
    }
}