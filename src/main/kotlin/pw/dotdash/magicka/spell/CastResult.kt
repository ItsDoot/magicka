package pw.dotdash.magicka.spell

enum class CastResult {

    SUCCESS,
    SUCCESS_SELF,
    SUCCESS_TARGET,

    NO_TARGET,

    FAILURE,
    CANCELED,

    NO_ACTION
}