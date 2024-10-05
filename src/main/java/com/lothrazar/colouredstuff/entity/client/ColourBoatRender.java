package com.lothrazar.colouredstuff.entity.client;

import org.joml.Quaternionf;
import com.lothrazar.colouredstuff.ModColourable;
import com.lothrazar.colouredstuff.registry.ColourableItemRegistry;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.Boat.Type;

public class ColourBoatRender extends EntityRenderer<Boat> {

  private static final ResourceLocation NONE = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/none.png");
  private static final ResourceLocation BLACK = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/black.png");
  private static final ResourceLocation BLUE = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/blue.png");
  private static final ResourceLocation BROWN = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/brown.png");
  private static final ResourceLocation CYAN = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/cyan.png");
  private static final ResourceLocation GRAY = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/gray.png");
  private static final ResourceLocation GREEN = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/green.png");
  private static final ResourceLocation LIGHT_BLUE = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/light_blue.png");
  private static final ResourceLocation LIGHT_GRAY = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/light_gray.png");
  private static final ResourceLocation LIME = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/lime.png");
  private static final ResourceLocation MAGENTA = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/magenta.png");
  private static final ResourceLocation ORANGE = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/orange.png");
  private static final ResourceLocation PINK = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/pink.png");
  private static final ResourceLocation PURPLE = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/purple.png");
  private static final ResourceLocation RED = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/red.png");
  private static final ResourceLocation WHITE = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/white.png");
  private static final ResourceLocation YELLOW = new ResourceLocation(ModColourable.MODID, "textures/entity/boat/yellow.png");
  protected final BoatModel model;

  public ColourBoatRender(EntityRendererProvider.Context context) {
    super(context);
    this.model = new BoatModel(context.bakeLayer(ModelLayers.createBoatModelName(Type.OAK)));
    this.shadowRadius = 0.8F;
  }

  @Override
  public ResourceLocation getTextureLocation(Boat entity) {
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_NONE.get()) {
      return NONE;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_BLACK.get()) {
      return BLACK;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_BLUE.get()) {
      return BLUE;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_BROWN.get()) {
      return BROWN;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_CYAN.get()) {
      return CYAN;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_GRAY.get()) {
      return GRAY;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_GREEN.get()) {
      return GREEN;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_LIGHT_BLUE.get()) {
      return LIGHT_BLUE;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_LIGHT_GRAY.get()) {
      return LIGHT_GRAY;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_LIME.get()) {
      return LIME;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_MAGENTA.get()) {
      return MAGENTA;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_ORANGE.get()) {
      return ORANGE;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_PINK.get()) {
      return PINK;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_PURPLE.get()) {
      return PURPLE;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_RED.get()) {
      return RED;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_WHITE.get()) {
      return WHITE;
    }
    if (entity.getType() == ColourableItemRegistry.BOAT_ENTITY_YELLOW.get()) {
      return YELLOW;
    }
    return BLACK;
  }

  @Override
  public void render(Boat entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
    poseStack.pushPose();
    poseStack.translate(0.0D, 0.375D, 0.0D);
    poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - entityYaw));
    float f = entityIn.getHurtTime() - partialTicks;
    float f1 = entityIn.getDamage() - partialTicks;
    if (f1 < 0.0F) {
      f1 = 0.0F;
    }
    if (f > 0.0F) {
      poseStack.mulPose(Axis.XP.rotationDegrees(Mth.sin(f) * f * f1 / 10.0F * entityIn.getHurtDir()));
    }
    float f2 = entityIn.getBubbleAngle(partialTicks);
    if (!Mth.equal(f2, 0.0F)) {
      poseStack.mulPose((new Quaternionf()).setAngleAxis(entityIn.getBubbleAngle(partialTicks) * ((float) Math.PI / 180F), 1.0F, 0.0F, 1.0F));
    }
    poseStack.scale(-1.0F, -1.0F, 1.0F);
    poseStack.mulPose(Axis.YP.rotationDegrees(90.0F));
    this.model.setupAnim(entityIn, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F);
    VertexConsumer ivertexbuilder = bufferIn.getBuffer(this.model.renderType(this.getTextureLocation(entityIn)));
    this.model.renderToBuffer(poseStack, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    if (!entityIn.isUnderWater()) {
      VertexConsumer ivertexbuilder1 = bufferIn.getBuffer(RenderType.waterMask());
      this.model.waterPatch().render(poseStack, ivertexbuilder1, packedLightIn, OverlayTexture.NO_OVERLAY);
    }
    poseStack.popPose();
    super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
  }
}