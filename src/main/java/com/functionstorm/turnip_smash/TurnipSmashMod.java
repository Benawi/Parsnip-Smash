package com.functionstorm.turnip_smash;

import com.functionstorm.turnip_smash.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TurnipSmashMod.modId, name = TurnipSmashMod.name, version = TurnipSmashMod.version, acceptedMinecraftVersions = "[1.11.2]")

public class TurnipSmashMod {
    public static final String modId = "turnip_smash";
    public static final String name = "Turnip Smash";
    public static final String version = "1.0.0";

    public static final String CLIENT_PROXY = "com.functionstorm.turnip_smash.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.functionstorm.turnip_smash.proxy.CommonProxy";


    @SidedProxy(clientSide = TurnipSmashMod.CLIENT_PROXY, serverSide = TurnipSmashMod.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.Instance(modId)
    public static TurnipSmashMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
