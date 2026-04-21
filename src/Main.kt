import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Temperaturani Farengeytda kiriting (TF): ")
    val tf = reader.nextDouble()

    // Farengeytni Selsiyga o'tkazish
    val tc = (tf - 32) * 5 / 9

    println("$tf °F = $tc °C")
}