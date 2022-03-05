package converter

import converter.token.Token
import converter.token.TokenMap
import converter.token.Type
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

class NumberConverter (val map: TokenMap, val input: String) {
    private val tokenStream: MutableList<Token> = mutableListOf()

    init {
        tokenize(input)
    }

    fun convert(): String {
        var temp = 0L
        var result = 0L

        tokenStream.forEach {
            when(it.type) {
                Type.IGNORE -> {}
                Type.TERMINAL -> temp += it.value
                Type.MULTIPLIER -> {
                    if (temp == 0L) {
                        temp = 1
                    }

                    if (it.commit) {
                        result += temp * it.value
                        temp = 0
                    } else {
                        temp *= it.value
                    }
                }
            }
        }

        result += temp

        val formatter = DecimalFormat("#,###", DecimalFormatSymbols(Locale.GERMANY))
        return formatter.format(result)
    }

    private fun tokenize(data: String) {
        var testString: String

        outer@ for (index in (data.length) downTo 0) {
            val tokenMap = map.get()
            testString = data.substring(0, index).trim()

            if (tokenMap.containsKey(testString)) {
                tokenStream.add(tokenMap[testString]!!)
                tokenize(data.substring(index).trim())

                break@outer
            }
        }
    }
}