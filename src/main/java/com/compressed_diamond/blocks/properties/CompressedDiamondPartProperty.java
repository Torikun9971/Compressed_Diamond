package com.compressed_diamond.blocks.properties;

import net.minecraft.util.IStringSerializable;

import javax.annotation.Nonnull;
import java.util.Locale;

public enum CompressedDiamondPartProperty implements IStringSerializable {
    TOP(0, 0, -1),
    LEFT(-1, 0, 0),
    CENTER(0, 0, 0),
    RIGHT(1, 0, 0),
    BOTTOM_LEFT(-1, 0, 1),
    BOTTOM(0, 0, 1),
    BOTTOM_RIGHT(1, 0, 1),
    TOP2(0, 1, -1),
    LEFT2(-1, 1, 0),
    CENTER2(0, 1, 0),
    RIGHT2(1, 1, 0),
    BOTTOM_LEFT2(-1, 1, 1),
    BOTTOM2(0, 1, 1),
    BOTTOM_RIGHT2(1, 1, 1);

    public final int x;
    public final int y;
    public final int z;

    CompressedDiamondPartProperty(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Nonnull
    public String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }

    public String toString() {
        return getSerializedName();
    }
}
