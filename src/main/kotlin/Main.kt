import converter.NumberConverter
import converter.token.map.Nl

fun main(args: Array<String>) {
    val converter = NumberConverter(Nl(), args.joinToString(" "))

    val out = converter.convert();
    println("Result: $out")
}