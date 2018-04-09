package pw.dotdash.magicka.action

import pw.dotdash.magicka.spell.CastResult
import pw.dotdash.magicka.spell.SpellContext

interface Action {

    /**
     * Called when a spell is loaded for the first time.
     * Per-player, Per-server-session.
     */
    fun init() {}

    /**
     * Called before a spell is cast.
     */
    fun ready(ctx: SpellContext) {}

    /**
     * Called to act out a spell.
     */
    fun perform(ctx: SpellContext): CastResult

    /**
     * Called when the entire spell cast is finished.
     */
    fun complete(ctx: SpellContext) {}
}