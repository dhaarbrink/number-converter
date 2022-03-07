package converter.token

data class Token(val value: Long, val type: Type, val commit: Boolean = false)