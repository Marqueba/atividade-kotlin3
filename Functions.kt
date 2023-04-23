/* Exercícios Funções
*   1 - Crie uma função que receba dois números inteiros como argumentos e retorne a soma dos mesmos
*   2 - Crie uma função que receba um número inteiro como argumento e retorne verdadeiro se o mesmo for par e falso caso contrário.
*   3 - Crie uma função que receba uma string como argumento e retorne verdadeiro se a mesma for palíndromo (ou seja, lida da esquerda para direita é igual a lida da direita para esquerda) e falso caso contrário.
*   4 - Crie uma função que receba um array de números inteiros como argumento e retorne o maior valor presente no array.
*   5 - Crie uma função que receba um array de strings como argumento e retorne uma nova lista contendo apenas as strings que possuem mais de 5 caracteres.
* */

fun main () {
    println(plus(2, 3))
    println(par(5))
    println(palindromo("Arara"))
    var lista = arrayOf<Int>(1, 3, 4, 5, 7)
    println(numberArray(lista))
    var array = arrayOf<String>("Opa", "Opapa", "Pai", "Papai", "Mãe", "Mamães")
    println(filtrarStrings(array))
}

// Exercício 1
fun plus(x:Int, y:Int) = x + y

// Exercício 2
fun par(num:Int): Boolean {
    return num%2 == 0
}
// Exercício 3
fun palindromo(text:String): Boolean {
    if (text.isEmpty()) {
        return false
    }
    val lowerCaseText = text.lowercase()
    var reverseText = ""
    for (i in lowerCaseText.length - 1 downTo 0) {
        reverseText += lowerCaseText[i]
    }
    return lowerCaseText == reverseText
}
// Exercício 4
fun numberArray (array: Array<Int>): Int {
    return array.max()
}
// Exercício 5
fun filtrarStrings(array: Array<String>): List<String> {
    return array.filter { it.length > 5 }
}
