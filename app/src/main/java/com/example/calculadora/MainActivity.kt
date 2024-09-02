package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val TvCalculo = findViewById<TextView>(R.id.textViewCalculo)
        val TvResultado = findViewById<TextView>(R.id.textViewResultado)

        val btnZero = findViewById<Button>(R.id.button0)
        btnZero.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}0"
        }

        val btnUm = findViewById<Button>(R.id.button1)
        btnUm.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}1"
        }

        val btnDois = findViewById<Button>(R.id.button2)
        btnDois.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}2"
        }

        val btnTres = findViewById<Button>(R.id.button3)
        btnTres.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}3"
        }

        val btnQuatro = findViewById<Button>(R.id.button4)
        btnQuatro.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}4"
        }

        val btnCinco = findViewById<Button>(R.id.button5)
        btnCinco.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}5"
        }

        val btnSeis = findViewById<Button>(R.id.button6)
        btnSeis.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}6"
        }

        val btnSete = findViewById<Button>(R.id.button7)
        btnSete.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}7"
        }

        val btnOito = findViewById<Button>(R.id.button8)
        btnOito.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}8"
        }

        val btnNove = findViewById<Button>(R.id.button9)
        btnNove.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}9"
        }

        val btnPonto = findViewById<Button>(R.id.buttonPonto)
        btnPonto.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}."
        }

        val btnMais = findViewById<Button>(R.id.buttonMais)
        btnMais.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}+"
        }

        val btnMenos = findViewById<Button>(R.id.buttonMenos)
        btnMenos.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}-"
        }

        val btnMultiplicacao = findViewById<Button>(R.id.buttonMultiplicacao)
        btnMultiplicacao.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}*"
        }

        val btnDivisao = findViewById<Button>(R.id.buttonDivisao)
        btnDivisao.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}/"
        }

        val btnPorcentagem = findViewById<Button>(R.id.buttonPorcentagem)
        btnPorcentagem.setOnClickListener {
            TvCalculo.text = "${TvCalculo.text}%"
        }

        val btnLimpar = findViewById<Button>(R.id.buttonLimpar)
        btnLimpar.setOnClickListener {
            TvCalculo.text = ""
            TvResultado.text = ""
        }

        val btnApagar = findViewById<Button>(R.id.buttonApagar)
        btnApagar.setOnClickListener {
            TvCalculo.text = TvCalculo.text.dropLast(n = 1)
        }

        val btnIgual = findViewById<Button>(R.id.buttonIgual)
        btnIgual.setOnClickListener {
            val resultado = Expression(TvCalculo.text.toString()).calculate()

            if (resultado.isNaN()){
                TvResultado.text = "ERRO!"
            }else {
                TvResultado.text = resultado.toString()
            }
        }
    }
}