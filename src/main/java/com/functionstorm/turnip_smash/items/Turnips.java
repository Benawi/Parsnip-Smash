package com.functionstorm.turnip_smash.items;

import com.functionstorm.turnip_smash.entity.projectile.EntityTurnip;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

/**
 * Created by Freddy on 06.05.2017.
 */
public class Turnips {



    public Turnips() {

    }

    public static class Turnip extends ModItem{
        public float damage;
        public int odds;

        public Turnip (String name, CreativeTabs tab) {
            super(name, tab);
        }

        /**
         * Called when the equipped item is right clicked.
         */
        public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
        {
            ItemStack itemstack = playerIn.getHeldItem(handIn);

            if (!playerIn.capabilities.isCreativeMode)
            {
                itemstack.shrink(1);
            }

            worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!worldIn.isRemote)
            {
                EntityTurnip entityturnip = new EntityTurnip(worldIn, playerIn, this);
                entityturnip.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
                worldIn.spawnEntity(entityturnip);
            }

            playerIn.addStat(StatList.getObjectUseStats(this));
            return new ActionResult(EnumActionResult.SUCCESS, itemstack);
        }
    }

    public static class Turnip_smile extends Turnip {
        public Turnip_smile(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 1.2F;
            this.odds = 60;
        }
    }

    public static class Turnip_wink extends Turnip {
        public Turnip_wink(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 2F;
            this.odds = 7;
        }
    }

    public static class Turnip_plain extends Turnip {
        public Turnip_plain(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 3.2F;
            this.odds = 2;
        }
    }

    public static class Turnip_stitch extends Turnip {
        public Turnip_stitch(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 6.08F;
            this.odds = 2;
        }
    }

    public static class Turnip_bomb extends Turnip {
        public Turnip_bomb(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 10.0F;
            this.odds = 1;
        }
    }

    public static class Turnip_sleep extends Turnip {
        public Turnip_sleep(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 1.2F;
            this.odds = 8;
        }
    }

    public static class Turnip_happy extends Turnip {
        public Turnip_happy(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 6;
            this.odds = 10;
        }
    }

    public static class Turnip_scared extends Turnip {
        public Turnip_scared(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 6;
            this.odds = 5;
        }
    }

    public static class Turnip_sceptic extends Turnip {
        public Turnip_sceptic(String name, CreativeTabs tab) {
            super(name, tab);
            this.damage = 6;
            this.odds = 5;
        }
    }
}
