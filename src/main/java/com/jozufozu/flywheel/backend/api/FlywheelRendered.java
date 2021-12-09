package com.jozufozu.flywheel.backend.api;

import net.minecraft.world.level.Level;

/**
 * Something (a BlockEntity or Entity) that can be rendered using the instancing API.
 */
public interface FlywheelRendered {

	/**
	 * @return true if there are parts of the renderer that cannot be implemented with Flywheel.
	 */
	default boolean shouldRenderNormally() {
		return false;
	}

	Level getWorld();
}