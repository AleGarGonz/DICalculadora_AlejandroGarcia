package com.example.sumador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sumador.ui.theme.SumadorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SumadorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaPrincipal()
                }
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun PantallaPrincipal() {
    //Variables
    var cadena by rememberSaveable {
        mutableStateOf("")
    }
    var isEnabled by rememberSaveable {
        mutableStateOf(false)
    }
    if(cadena.length>=1){
        isEnabled=true
    }else{
        isEnabled=false
    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(.4f)
                .background(Color.Green)
        ) {
            MostrarPorPantalla(str = cadena)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    androidx.compose.ui.graphics.Color.White
                )
        ) {
            Row {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .background(color = Color.White)
                        .weight(.7f)
                ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .background(color = Color.Black)
                        .weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("1", true, {
                            cadena += "1"
                        })
                    }

                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        OperationButton("2", true, {
                            cadena += "2"
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        OperationButton("3", true, {
                            cadena += "3"
                        })
                    }
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .background(color = Color.Black)
                        .weight(1f)
                ) {

                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("4", true, {
                            cadena += "4"
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("5", true, {
                            cadena += "5"
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        OperationButton("6", true, {
                            cadena += "6"
                        })
                    }
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .background(color = Color.Black)
                        .weight(1f)
                ) {

                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("7", true, {
                            cadena += "7"
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("8", true, {
                            cadena += "8"
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        OperationButton("9", true, {
                            cadena += "9"
                        })
                    }
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .background(color = Color.Black)
                        .weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        OperationButton("⌫", isEnabled, {
                            cadena = cadena.substring(0,cadena.length-1)
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("0", isEnabled, {
                            cadena += "0"
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("=", isEnabled, {
                            cadena = calcular(cadena).toString()
                        })
                    }
                }
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .background(color = Color.Black)
                            .weight(1f)
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(4.dp)
                                .fillMaxSize()
                                .weight(1f), contentAlignment = Alignment.Center
                        ) {
                            OperationButton("AC", isEnabled, {
                                cadena = ""
                            })
                        }
                        Box(
                            modifier = Modifier
                                .padding(4.dp)
                                .fillMaxSize()
                                .weight(1f), contentAlignment = Alignment.Center

                        ) {
                            OperationButton(".", isEnabled, {
                                cadena += "."
                            })
                        }
                    }
            }
                Column(
                    Modifier
                        .fillMaxWidth()
                        .background(color = Color.Black)
                        .weight(.15f)
                ) {
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        OperationButton("+", isEnabled, {
                            cadena += "+"
                        })
                    }

                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center
                    ) {
                        OperationButton("-", isEnabled, {
                            cadena += "-"
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("*", isEnabled, {
                            cadena += "*"
                        })
                    }
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxSize()
                            .weight(1f), contentAlignment = Alignment.Center

                    ) {
                        OperationButton("/", isEnabled, {
                            cadena += "/"
                        })
                    }
                }
            }
        }
    }
}

@Composable
fun OperationButton(operacion: String, isEnabled: Boolean, onKeyPresseded: () -> Unit) {
    Button(
        modifier = Modifier
            .size(150.dp),
        enabled = isEnabled,
        onClick = { onKeyPresseded() },
        colors=ButtonDefaults.buttonColors(Color.Black)
        ) {
        Text(text = operacion,
            style= TextStyle(fontSize = 20.sp )
        )

    }
}
@Composable
fun MostrarPorPantalla(str: String) {
    Text(
        text = str, Modifier.fillMaxWidth(),
        style = TextStyle(
            fontSize = 40.sp,
            shadow = Shadow(
                color = Color.Blue,
                blurRadius = 3f
            )
        ),
        textAlign = TextAlign.End,
    )
}
fun calcular(cadenaChar: String): Double {
    val numeros = mutableListOf<Double>()//lista de numeros
    val operadores = mutableListOf<Char>()//lista de operadores
    val currentNumber = StringBuilder()
    var ultimoCharOperador = true // Se inicializa como true para permitir números negativos al principio

    for (char in cadenaChar) {
        if (char.isDigit() || char == '.' || (char == '-' && ultimoCharOperador)) {
            currentNumber.append(char)
            ultimoCharOperador = false
        } else {
            if (!ultimoCharOperador) {
                if (currentNumber.isNotEmpty()) {
                    numeros.add(currentNumber.toString().toDouble())
                    currentNumber.clear()
                }

                if (char in setOf('+', '-')) {
                    operadores.add(char)
                    ultimoCharOperador = true
                } else if (char in setOf('*', '/')) {
                    operadores.add(char)
                    ultimoCharOperador = false
                }
            } else {
                ultimoCharOperador = true
            }
        }
    }

    if (currentNumber.isNotEmpty()) {
        numeros.add(currentNumber.toString().toDouble())
    }

    // Prioridad en la multiplicacion y division
    var i = 0
    while (i < operadores.size) {
        if (operadores[i] == '*' || operadores[i] == '/') {
            val num1 = numeros[i]
            val num2 = numeros[i + 1]
            val result = if (operadores[i] == '*') num1 * num2 else num1 / num2

            // Actualizar la lista de numeros y operadores
            numeros[i] = result
            numeros.removeAt(i + 1)
            operadores.removeAt(i)
        } else {
            i++
        }
    }
    var result = numeros[0]
    for (i in 0 until operadores.size) {
        val nextNumber = numeros[i + 1]

        when (operadores[i]) {
            '+' -> result += nextNumber
            '-' -> result -= nextNumber
        }
    }

    return result
}
