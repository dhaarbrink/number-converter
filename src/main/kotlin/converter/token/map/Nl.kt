package converter.token.map

import converter.token.Token
import converter.token.TokenMap
import converter.token.Type

class Nl : TokenMap {
    override fun get(): Map<String, Token> {
        return mapOf(
            "en" to Token(0, Type.IGNORE),
            "een" to Token(1, Type.TERMINAL),
            "twee" to Token(2, Type.TERMINAL),
            "drie" to Token(3, Type.TERMINAL),
            "vier" to Token(4, Type.TERMINAL),
            "vijf" to Token(5, Type.TERMINAL),
            "zes" to Token(6, Type.TERMINAL),
            "zeven" to Token(7, Type.TERMINAL),
            "acht" to Token(8, Type.TERMINAL),
            "negen" to Token(9, Type.TERMINAL),
            "tien" to Token(10, Type.TERMINAL),
            "elf" to Token(11, Type.TERMINAL),
            "twaalf" to Token(12, Type.TERMINAL),
            "dertien" to Token(13, Type.TERMINAL),
            "veertien" to Token(14, Type.TERMINAL),
            "vijftien" to Token(15, Type.TERMINAL),
            "zestien" to Token(16, Type.TERMINAL),
            "zeventien" to Token(17, Type.TERMINAL),
            "achttien" to Token(18, Type.TERMINAL),
            "negentien" to Token(19, Type.TERMINAL),
            "twintig" to Token(20, Type.TERMINAL),
            "dertig" to Token(30, Type.TERMINAL),
            "veertig" to Token(40, Type.TERMINAL),
            "vijftig" to Token(50, Type.TERMINAL),
            "zestig" to Token(60, Type.TERMINAL),
            "zeventig" to Token(70, Type.TERMINAL),
            "tachtig" to Token(80, Type.TERMINAL),
            "negentig" to Token(90, Type.TERMINAL),
            "honderd" to Token(100, Type.MULTIPLIER),
            "duizend" to Token(1_000, Type.MULTIPLIER, true),
            "miljoen" to Token(1_000_000, Type.MULTIPLIER, true),
            "miljard" to Token(1_000_000_000, Type.MULTIPLIER, true),
        )
    }
}
