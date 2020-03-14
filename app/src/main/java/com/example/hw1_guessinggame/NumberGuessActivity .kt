package com.example.hw1_guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_number_guess.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //var boton: Button? = null
    var count= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)
      //  boton = findViewById(R.id.boton1) as Button

        var rnum= ran()


    val Num1 = findViewById<EditText>(R.id.Num1)
    val check: Button = findViewById(R.id.boton1) as Button
    val check2: Button = findViewById(R.id.boton2) as Button


        check.setOnClickListener {

            val enteredNum = Num1.text.toString()
            count++


                 if(rnum == Integer.parseInt(enteredNum))  {
                Toast.makeText(applicationContext, "Buen Trabajo, el numero total de intentos fue "+count.toString(), Toast.LENGTH_SHORT).show()
                neointen()
                 rnum = ran()
                }
                else if(rnum < Integer.parseInt(enteredNum)) {
                Toast.makeText(applicationContext, "Fallo, El numero es MENOR", Toast.LENGTH_SHORT).show()
                    borrar()
                }
                else if (rnum > Integer.parseInt(enteredNum)) {
                    Toast.makeText(applicationContext, "Fallo, El numero es MAYOR", Toast.LENGTH_SHORT).show()
                    borrar()
                    }
                                }

        check2.setOnClickListener{
        neointen()
        rnum = ran()                       }

    }

        fun neointen(){
        borrar()
        count = 0
        Toast.makeText(applicationContext, "Comencemos el siguiente juego", Toast.LENGTH_SHORT).show()

        }

        fun borrar(){
        Num1.editableText.clear()
                    }

         fun ran(): Int{
        val numero : Int = Random.nextInt(1,1000)
        Toast.makeText(applicationContext, numero.toString(), Toast.LENGTH_LONG).show()
        return numero
                        }
}


