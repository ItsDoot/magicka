package pw.dotdash.magicka.spell

interface SpellContext {

    fun <T> getAll(key: String): Collection<T>

    fun <T> get(key: String): T?

    fun <T> require(key: String): T

    fun <T> set(key: String, value: T)

    fun has(key: String): Boolean
}