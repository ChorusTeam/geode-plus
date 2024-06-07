package net.yeoxuhang.geode_plus.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.level.Level;
import net.yeoxuhang.geode_plus.GeodePlus;
import net.yeoxuhang.geode_plus.client.GeodePlusClient;
import net.yeoxuhang.geode_plus.client.model.WrappistPedestalBlockEntityModel;
import net.yeoxuhang.geode_plus.server.block.entity.WrappistPedestalBlockEntity;

import java.util.Calendar;

public class WrappistPedestalBlockEntityRenderer<T extends WrappistPedestalBlockEntity> implements BlockEntityRenderer<T> {
    public static final ResourceLocation TEXTURE = GeodePlus.createResource("textures/entity/wrappist_pedestal/default.png");
    public static final ResourceLocation XMAS = GeodePlus.createResource("textures/entity/wrappist_pedestal/christmas.png");
    private final ItemRenderer itemRenderer;
    private final EntityRenderDispatcher entityRenderer;
    private boolean xmasTextures;
    private static WrappistPedestalBlockEntityModel wrappistPedestal;


    public WrappistPedestalBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.itemRenderer = context.getItemRenderer();
        this.entityRenderer = context.getEntityRenderer();
        wrappistPedestal = new WrappistPedestalBlockEntityModel(context.bakeLayer(GeodePlusClient.WRAPPIST_PEDESTAL));
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.xmasTextures = true;
        }
    }

    @Override
    public void render(T entity, float f, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int j) {
        Level world = entity.getLevel();
        assert world != null;
        long gameTime = world.getGameTime();
        float offsetY = (float)Math.sin((float)gameTime / 8.0F) * 0.025F;
        float crystalTick = gameTime / 35.0F;
        float tick = gameTime / 10.0F;
        poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
        if (xmasTextures) {
            wrappistPedestal.renderToBuffer(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(XMAS)), i, j, 1.0F, 1.0F, 1.0F, 1.0F);
        } else wrappistPedestal.renderToBuffer(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE)), i, j, 1.0F, 1.0F, 1.0F, 1.0F);
        wrappistPedestal.wrappist_pedestal.setPos(8.0F, -2.0F, -8.0F);
        wrappistPedestal.crystals.setRotation(0.0F, -crystalTick % 360.0F, 0.0F);
        if (entity.hasLevel() && !entity.isEmpty()) {
            poseStack.pushPose();
            poseStack.translate(0.5, (double)offsetY - 1.0, -0.5);
            poseStack.scale(0.35F, 0.35F, 0.35F);
            poseStack.mulPose(Axis.YP.rotationDegrees(tick % 360.0F));
            poseStack.mulPose(Axis.XP.rotationDegrees(-180.0F));
            this.itemRenderer.renderStatic(entity.getItem(0), ItemDisplayContext.FIXED, i, OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, entity.getLevel(), j);
            poseStack.popPose();
        }
    }
}
