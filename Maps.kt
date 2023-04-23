/* Exercícios Maps(Dicionário)
*   1 - Como criar um Map em Kotlin com as cores e seus respectivos códigos RGB?
*   2 - Como verificar se um determinado elemento existe em um Map em Kotlin?
*   3 - Como remover um elemento específico de um Map em Kotlin?
* */

fun main () {
    // Exercício 1
    var colorsRGB = mutableMapOf(
        "red" to "FF0000",
        "green" to "00FF00",
        "blue" to "0000FF"
    )
    // Exercício 2
    if ("green" in colorsRGB) {
        println("A cor verde existe no Map.")
    }
    // Exercício 3
    colorsRGB.remove("red")
}
