package com.functionstorm.turnip_smash.entity.projectile;

import com.functionstorm.turnip_smash.items.Turnips;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;


public class EntityTurnip extends EntityThrowable {

    public static Turnips.Turnip turnip;

    public EntityTurnip(World worldIn, Turnips.Turnip thrownTurnip)
    {
        super(worldIn);
        turnip = thrownTurnip;
    }

    public EntityTurnip(World worldIn, EntityLivingBase throwerIn, Turnips.Turnip thrownTurnip)
    {
        super(worldIn, throwerIn);
        turnip = thrownTurnip;
    }

    public EntityTurnip(World worldIn, double x, double y, double z, Turnips.Turnip thrownTurnip)
    {
        super(worldIn, x, y, z);
        turnip = thrownTurnip;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(RayTraceResult result)
    {

        if (result.entityHit != null)
        {
            if(turnip instanceof Turnips.Turnip_bomb) {
                Explosion explode = new Explosion(world, this, this.posX, this.posY, this.posZ, turnip.damage, false, false);
                result.entityHit.attackEntityFrom(DamageSource.causeExplosionDamage(explode), turnip.damage);
                this.world.newExplosion((Entity)null, this.posX, this.posY, this.posZ, (float)turnip.damage, false, false);
            }else {
                result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), turnip.damage);
            }

        }

        if (!this.world.isRemote)
        {
            this.world.setEntityState(this, (byte)3);
            this.setDead();
        }
    }

}
