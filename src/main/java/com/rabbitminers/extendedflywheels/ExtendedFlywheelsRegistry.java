package com.rabbitminers.extendedflywheels;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

import javax.annotation.Nullable;
import java.util.*;

public class ExtendedFlywheelsRegistry<K extends IForgeRegistry<K> & IForgeRegistryEntry<K>, V> {
    private static final List<ExtendedFlywheelsRegistry<?, ?>> ALL = new ArrayList<>();

    protected final IForgeRegistry<K> objectRegistry;
    protected final Map<ResourceLocation, V> locationMap = new HashMap<>();
    protected final Map<K, V> objectMap = new IdentityHashMap<>();
    protected boolean unwrapped = false;

    public ExtendedFlywheelsRegistry(IForgeRegistry<K> objectRegistry) {
        this.objectRegistry = objectRegistry;
        ALL.add(this);
    }

    public void register(ResourceLocation location, V value) {
        if (!unwrapped) {
            locationMap.put(location, value);
        } else {
            K object = objectRegistry.getValue(location);
            if (object != null) {
                objectMap.put(object, value);
            }
        }
    }

    public void register(K object, V value) {
        if (unwrapped) {
            objectMap.put(object, value);
        } else {
            ResourceLocation location = objectRegistry.getKey(object);
            if (location != null) {
                locationMap.put(location, value);
            }
        }
    }

    @Nullable
    public V get(ResourceLocation location) {
        if (!unwrapped) {
            return locationMap.get(location);
        } else {
            K object = objectRegistry.getValue(location);
            if (object != null) {
                return objectMap.get(object);
            } else {
                return null;
            }
        }
    }

    @Nullable
    public V get(K object) {
        if (unwrapped) {
            return objectMap.get(object);
        } else {
            ResourceLocation location = objectRegistry.getKey(object);
            if (location != null) {
                return locationMap.get(location);
            } else {
                return null;
            }
        }
    }

    public boolean isUnwrapped() {
        return unwrapped;
    }

    protected void unwrap() {
        for (Map.Entry<ResourceLocation, V> entry : locationMap.entrySet()) {
            ResourceLocation location = entry.getKey();
            K object = objectRegistry.getValue(location);
            if (object != null) {
                objectMap.put(object, entry.getValue());
            }
        }
        unwrapped = true;
    }

    public static void unwrapAll() {
        for (ExtendedFlywheelsRegistry<?, ?> registry : ALL) {
            registry.unwrap();
        }
    }
}
