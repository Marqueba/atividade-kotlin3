/* Exercícios de Tipos de argumento de função
*   1 - Crie uma função que receba um número variável de argumentos do tipo Int. e retorne a soma dos mesmos.
*   2 - Crie uma função que receba um array de números inteiros e um número inteiro n como argumentos e retorne uma nova lista contendo apenas os elementos do array que são maiores do que n.
*   3 - Crie uma função que receba uma função de transformação como argumento, um array de números inteiros e retorne uma nova lista contendo os elementos do array transformados pela função de transformação.
*   4 - Crie uma função que receba um array de strings e um caractere como argumentos e retorne uma nova lista contendo apenas as strings que começam com o caractere informado.
*   5 - Crie uma função que receba um array de números inteiros e um número inteiro n como argumentos e retorne uma nova lista contendo apenas os elementos do array que estão nas posições múltiplas de n.
* */

fun main () {
    println(plus(3, 4, 4, 6, 76, 6))
    val numeros = arrayOf(1, 2, 3, 4, 5)
    val numerosDobrados = transform(numeros) { it * 2 }
    println(numerosDobrados)
}

// Exercício 1
fun plus(vararg number: Int): Int {
    var soma = 0
    for (x in number)
        soma += x
    return soma
}
// Exercício 2
fun filterNumbers(array: Array<Int>, n: Int): List<Int> {
    return array.filter { it > n }
}

// Exercício 3
fun transform( array: Array<Int>, funcaoTransformacao: (Int) -> Int): List<Int> {
    return array.map { funcaoTransformacao(it) }
}

// Exercício 4
fun filterCaracter(array: Array<String>, n: Char): List<String> {
    return array.filter { it.startsWith(n) }
}

// Exercício 5
fun filtrarMultiple(array: Array<Int>, n: Int): List<Int> {
    return array.filterIndexed { index, _ -> (index + 1) % n == 0 }
}

