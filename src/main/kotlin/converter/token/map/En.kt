package converter.token.map;

import converter.token.Token
import converter.token.TokenMap
import converter.token.Type

class En: TokenMap {
    override fun get(): Map<String, Token> {
        return mapOf(
            "and" to Token(0, Type.IGNORE),
            "one" to Token(1, Type.TERMINAL),
            "two" to Token(2, Type.TERMINAL),
            "three" to Token(3, Type.TERMINAL),
            "four" to Token(4, Type.TERMINAL),
            "five" to Token(5, Type.TERMINAL),
            "six" to Token(6, Type.TERMINAL),
            "seven" to Token(7, Type.TERMINAL),
            "eight" to Token(8, Type.TERMINAL),
            "nine" to Token(9, Type.TERMINAL),
            "ten" to Token(10, Type.TERMINAL),
            "eleven" to Token(11, Type.TERMINAL),
            "twelve" to Token(12, Type.TERMINAL),
            "thirteen" to Token(13, Type.TERMINAL),
            "fourteen" to Token(14, Type.TERMINAL),
            "fifteen" to Token(15, Type.TERMINAL),
            "sixteen" to Token(16, Type.TERMINAL),
            "seventeen" to Token(17, Type.TERMINAL),
            "eighteen" to Token(18, Type.TERMINAL),
            "nineteen" to Token(19, Type.TERMINAL),
            "twenty" to Token(20, Type.TERMINAL),
            "thirty" to Token(30, Type.TERMINAL),
            "forty" to Token(40, Type.TERMINAL),
            "fifty" to Token(50, Type.TERMINAL),
            "sixty" to Token(60, Type.TERMINAL),
            "seventy" to Token(70, Type.TERMINAL),
            "eighty" to Token(80, Type.TERMINAL),
            "ninety" to Token(90, Type.TERMINAL),
            "hundred" to Token(100, Type.MULTIPLIER),
            "thousand" to Token(1_000, Type.MULTIPLIER, true),
            "million" to Token(1_000_000, Type.MULTIPLIER, true),
            "billion" to Token(1_000_000_000, Type.MULTIPLIER, true),
        )
}
}
