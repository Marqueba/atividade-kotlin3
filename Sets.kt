/* Exercícios Sets
*   1 - Como criar um Set em Kotlin com os números de 1 a 5?
*   2 - Como verificar se um determinado elemento existe em um Set em Kotlin?
*   3 - Como remover um elemento específico de um Set em Kotlin?
* */

fun main () {
    // Exercício 1
    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    // Exercício 2
    println(set.contains(3))
    // Exercício 3
    set.remove(4)
    println(set)
}