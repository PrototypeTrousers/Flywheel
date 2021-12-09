package com.jozufozu.flywheel.backend.api;

public interface MaterialGroup {
	/**
	 * Get the material as defined by the given {@link MaterialSpec spec}.
	 *
	 * @param spec The material you want to create instances with.
	 * @param <D>  The type representing the per instance data.
	 * @return A material you can use to render models.
	 */
	<D extends InstanceData> Material<D> material(MaterialSpec<D> spec);
}