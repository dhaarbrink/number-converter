package converter.token

class Token(val value: Long, val type: Type, val commit: Boolean = false) {
    override fun toString(): String {
        return "[value: $value, type: $type, commit: $commit]"
    }
}