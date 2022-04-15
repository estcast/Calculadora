package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var text: TextView = findViewById(R.id.MainText)

        val buttonC : Button = findViewById(R.id.buttonC)
        buttonC.setOnClickListener{Clear(text)}

        val buttonPorcentaje : Button = findViewById(R.id.buttonPorcentaje)
        buttonPorcentaje.setOnClickListener{Porcentaje(text)}

        val buttonDivision : Button = findViewById(R.id.buttonDivide)
        buttonDivision.setOnClickListener{Division(text)}

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener{Siete(text)}

        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener{Ocho(text)}

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener{Nueve(text)}

        val buttonMultiplica: Button = findViewById(R.id.buttonMultiplicacion)
        buttonMultiplica.setOnClickListener{Multiplica(text)}

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{Cuatro(text)}

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener{Cinco(text)}

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener{Seis(text)}

        val buttonResta: Button = findViewById(R.id.buttonResta)
        buttonResta.setOnClickListener{Resta(text)}

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener{Uno(text)}

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener{Dos(text)}

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener{Tres(text)}

        val buttonSuma: Button = findViewById(R.id.buttonSuma)
        buttonSuma.setOnClickListener{Suma(text)}

        val button0: Button = findViewById(R.id.button0)
        button0.setOnClickListener{Cero(text)}

        val buttonPunto: Button = findViewById(R.id.buttonPunto)
        buttonPunto.setOnClickListener{Punto(text)}

        val buttonIgual: Button = findViewById(R.id.buttonIgual)
        buttonIgual.setOnClickListener{Igual(text)}
    }

    private fun Igual(text: TextView) {
        val expression = Expression(text.text.toString())
       // println(expression.calculate())
        text.text = expression.calculate().toString()
    }

    private fun Punto(text: TextView) {
        text.text = text.text.toString() + "."
    }

    private fun Cero(text: TextView) {
        text.text = text.text.toString() + "0"
    }

    private fun Suma(text: TextView) {
        text.text = text.text.toString() + "+"
    }

    private fun Tres(text: TextView) {
        text.text = text.text.toString() + "3"
    }

    private fun Dos(text: TextView) {
        text.text = text.text.toString() + "2"
    }

    private fun Uno(text: TextView) {
        text.text = text.text.toString() + "1"
    }

    private fun Resta(text: TextView) {
        text.text = text.text.toString() + "-"
    }

    private fun Seis(text: TextView) {
        text.text = text.text.toString() + "6"
    }

    private fun Cinco(text: TextView) {
        text.text = text.text.toString() + "5"
    }

    private fun Cuatro(text: TextView) {
        text.text = text.text.toString() + "4"
    }

    private fun Multiplica(text: TextView) {
        text.text = text.text.toString() + "*"
    }

    private fun Nueve(text: TextView) {
        text.text = text.text.toString() + "9"
    }

    private fun Ocho(text: TextView) {
        text.text = text.text.toString() + "8"
    }

    private fun Siete(text: TextView) {
        text.text = text.text.toString() + "7"
    }

    private fun Division(text: TextView) {
        text.text = text.text.toString() + "/"
    }

    private fun Porcentaje(text: TextView) {
        text.text = text.text.toString() + "%"
    }

    private fun Clear(text:TextView) {
        text.text = ""
    }
}