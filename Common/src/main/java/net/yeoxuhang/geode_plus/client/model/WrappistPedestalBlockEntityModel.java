package net.yeoxuhang.geode_plus.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
public class WrappistPedestalBlockEntityModel extends Model {
	public final ModelPart root;
	public final ModelPart wrappist_pedestal;
	public final ModelPart crystals;
	public final ModelPart crystal1;
	public final ModelPart crystal2;
	public final ModelPart crystal3;
	public final ModelPart crystal4;


	public WrappistPedestalBlockEntityModel(ModelPart modelPart) {
		super(RenderType::entityCutoutNoCull);
		this.root = modelPart;
		this.wrappist_pedestal = root.getChild("wrappist_pedestal");
		this.crystals = wrappist_pedestal.getChild("crystals");
		this.crystal1 = this.crystals.getChild("crystal1");
		this.crystal2 = this.crystals.getChild("crystal2");
		this.crystal3 = this.crystals.getChild("crystal3");
		this.crystal4 = this.crystals.getChild("crystal4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wrappist_pedestal = partdefinition.addOrReplaceChild("wrappist_pedestal", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition crystals = wrappist_pedestal.addOrReplaceChild("crystals", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition crystal1 = crystals.addOrReplaceChild("crystal1", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, -5.0F));

		PartDefinition cube_r1 = crystal1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, -2.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition crystal2 = crystals.addOrReplaceChild("crystal2", CubeListBuilder.create(), PartPose.offset(-5.5F, 2.5F, 0.0F));

		PartDefinition cube_r2 = crystal2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -2.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -3.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition crystal3 = crystals.addOrReplaceChild("crystal3", CubeListBuilder.create(), PartPose.offset(0.0F, 3.5F, 5.0F));

		PartDefinition cube_r3 = crystal3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition crystal4 = crystals.addOrReplaceChild("crystal4", CubeListBuilder.create(), PartPose.offset(5.5F, 2.5F, 0.0F));

		PartDefinition cube_r4 = crystal4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -2.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -3.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition pedestal = wrappist_pedestal.addOrReplaceChild("pedestal", CubeListBuilder.create().texOffs(0, 20).addBox(-7.0F, -8.0F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-7.0F, -14.0F, 7.0F, 14.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(7.0F, -14.0F, -7.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0F, -14.0F, -7.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int i, int j, float f, float g, float h, float k) {
		wrappist_pedestal.render(poseStack, vertexConsumer, i, j, f, g, h, k);
	}
}