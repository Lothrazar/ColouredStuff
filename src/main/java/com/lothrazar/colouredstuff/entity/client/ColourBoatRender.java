package com.lothrazar.colouredstuff.entity.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.renderer.entity.AbstractBoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.BoatRenderState;
import net.minecraft.resources.Identifier;

public class ColourBoatRender extends AbstractBoatRenderer {

  protected final BoatModel model;

  public ColourBoatRender(EntityRendererProvider.Context context, Identifier texture) {
    super(context, texture);
    this.model = new BoatModel(context.bakeLayer(ModelLayers.OAK_BOAT));
  }

  @Override
  protected EntityModel<BoatRenderState> model() {
    return this.model;
  }
}
