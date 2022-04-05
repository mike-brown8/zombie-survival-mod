
package net.mcreator.mzs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.mzs.itemgroup.MikesZombieSurvivalItemGroup;
import net.mcreator.mzs.MzsModElements;

@MzsModElements.ModElement.Tag
public class BulletItem extends MzsModElements.ModElement {
	@ObjectHolder("mzs:bullet")
	public static final Item block = null;

	public BulletItem(MzsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MikesZombieSurvivalItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bullet");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
