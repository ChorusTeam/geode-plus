package net.yeoxuhang.geode_plus.server.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.yeoxuhang.geode_plus.server.registry.BlockEntityRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WrappistPedestalBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer {
    private NonNullList<ItemStack> stacks = NonNullList.withSize(1, ItemStack.EMPTY);

    public WrappistPedestalBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityRegistry.WRAPPIST_PEDESTAL.get(), pWorldPosition, pBlockState);
    }
    @Override
    public int @NotNull [] getSlotsForFace(@NotNull Direction direction) {
        return new int[0];
    }

    @Override
    public boolean canPlaceItemThroughFace(int i, @NotNull ItemStack stack, @Nullable Direction direction) {
        return true;
    }

    @Override
    public boolean canTakeItemThroughFace(int i, @NotNull ItemStack stack, @NotNull Direction direction) {
        return false;
    }

    @Override
    public int getContainerSize() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < this.getContainerSize(); i++) {
            if (!this.getItem(i).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public @NotNull ItemStack getItem(int i) {
        return stacks.get(i);
    }

    @Override
    public @NotNull ItemStack removeItem(int i, int j) {
        if (!this.stacks.get(i).isEmpty()) {
            ItemStack itemstack;

            if (this.stacks.get(i).getCount() <= j) {
                itemstack = this.stacks.get(i);
                this.stacks.set(i, ItemStack.EMPTY);
            } else {
                itemstack = this.stacks.get(i).split(j);

                if (this.stacks.get(i).isEmpty()) {
                    this.stacks.set(i, ItemStack.EMPTY);
                }

            }
            return itemstack;
        } else {
            return ItemStack.EMPTY;
        }
    }

    @Override
    public @NotNull ItemStack removeItemNoUpdate(int i) {
        ItemStack stack = this.stacks.get(i);
        if (stack.isEmpty()) {
            return ItemStack.EMPTY;
        } else {
            this.stacks.set(i, ItemStack.EMPTY);
            return stack;
        }
    }

    @Override
    public void setItem(int i, @NotNull ItemStack itemStack) {
        this.stacks.set(i, itemStack);
        if (!itemStack.isEmpty() && itemStack.getCount() > this.getMaxStackSize()) {
            itemStack.setCount(this.getMaxStackSize());
        }
        this.saveAdditional(this.getUpdateTag());
    }

    public void clearContent() {
        stacks.clear();
    }


    @Override
    public void load(@NotNull CompoundTag compound) {
        super.load(compound);
        this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        ContainerHelper.loadAllItems(compound, this.stacks);
    }

    @Override
    public void saveAdditional(@NotNull CompoundTag compound) {
        super.saveAdditional(compound);
        ContainerHelper.saveAllItems(compound, this.stacks);
    }


    @Override
    public @NotNull Component getDisplayName() {
        return getDefaultName();
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return Component.translatable("block.geode_plus.wrappist_pedestal");
    }

    @Override
    protected  AbstractContainerMenu createMenu(int i, @NotNull Inventory inventory) {
        return null;
    }

    public @NotNull CompoundTag getUpdateTag() {
        CompoundTag tag = new CompoundTag();
        this.saveAdditional(tag);
        return tag;
    }

    public boolean stillValid(Player player) {
        return this.worldPosition.distSqr(player.blockPosition()) <= 16.0;
    }

    public int getMaxStackSize() {
        return 64;
    }
}
