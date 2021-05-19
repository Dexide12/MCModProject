package xyz.dexide.firstmod.core.init;

import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.dexide.firstmod.FirstMod;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> FIRST_ITEM = ITEMS.register("first_item",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
