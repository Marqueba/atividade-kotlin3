/* Exercícios sobre Listas
*   1 - Como criar uma lista em Kotlin com os números de 1 a 10?
*   2 - Como adicionar um elemento na posição 2 de uma lista já existente em Kotlin?
*   3 - Como remover o último elemento de uma lista em Kotlin?
* */

fun main () {
    // Exercício 1
    var lista = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Exercício 2
    lista.add(1, 12)
    // Exercício 3
    lista.removeAt(lista.size -1)
}