package com.ferreusveritas.dynamictrees.models.bakedmodels;

import com.ferreusveritas.dynamictrees.util.RootConnections;
import net.minecraftforge.client.model.data.IModelData;
import net.minecraftforge.client.model.data.ModelProperty;

import javax.annotation.Nullable;

/**
 * @author Harley O'Connor
 */
public class RootModelConnections extends RootConnections implements IModelData {

    public RootModelConnections () {}

    public RootModelConnections (RootConnections connections) {
        this.setAllRadii(connections.getAllRadii());
        this.setConnectionLevels(connections.getConnectionLevels());
    }

    @Override
    public boolean hasProperty(ModelProperty<?> prop) {
        return false;
    }

    @Nullable
    @Override
    public <T> T getData(ModelProperty<T> prop) {
        return null;
    }

    @Nullable
    @Override
    public <T> T setData(ModelProperty<T> prop, T data) {
        return null;
    }

}
