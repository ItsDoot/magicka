package pw.dotdash.magicka.spell

import com.flowpowered.math.vector.Vector3d
import org.spongepowered.api.block.BlockState
import org.spongepowered.api.entity.Entity
import org.spongepowered.api.plugin.PluginContainer
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.World

val SpellContext.entity: Entity
    get() = this.require("entity")

val SpellContext.location: Location<World>
    get() = this.require("location")

val SpellContext.direction: Vector3d
    get() = this.require("direction")

val SpellContext.world: World
    get() = this.require("world")

val SpellContext.plugin: PluginContainer
    get() = this.require("plugin")

val SpellContext.targetEntity: Entity?
    get() = this.get("target_entity")

val SpellContext.targetLocation: Location<World>?
    get() = this.get("target_location")

val SpellContext.targetBlock: BlockState?
    get() = this.get("target_block")