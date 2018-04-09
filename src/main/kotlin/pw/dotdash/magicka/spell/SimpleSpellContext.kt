package pw.dotdash.magicka.spell

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap

@Suppress("UNCHECKED_CAST")
class SimpleSpellContext : SpellContext {

    private val ctx: Multimap<String, Any> = ArrayListMultimap.create<String, Any>()

    override fun <T> getAll(key: String): Collection<T> = ctx[key] as Collection<T>

    override fun <T> get(key: String): T? =
            ctx[key].firstOrNull() as T?

    override fun <T> require(key: String): T =
            get<T>(key) ?: throw IllegalArgumentException("SpellContext does not contain a value for '$key'")

    override fun <T> set(key: String, value: T) {
        ctx.put(key, value)
    }

    override fun has(key: String): Boolean = ctx.containsKey(key)
}