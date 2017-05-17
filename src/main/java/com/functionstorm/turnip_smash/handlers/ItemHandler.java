package com.functionstorm.turnip_smash.handlers;

import com.functionstorm.turnip_smash.items.Turnips;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ItemHandler {

    public static Turnips.Turnip_smile turnip_smile;
    public static Turnips.Turnip_scared turnip_scared;
    public static Turnips.Turnip_bomb turnip_bomb;
    public static Turnips.Turnip_stitch turnip_stitch;
    public static Turnips.Turnip_wink turnip_wink;
    public static Turnips.Turnip_plain turnip_plain;
    public static Turnips.Turnip_sceptic turnip_sceptic;
    public static Turnips.Turnip_sleep turnip_sleep;
    public static Turnips.Turnip_happy turnip_happy;

    public static void init() {

        turnip_smile = new Turnips.Turnip_smile("turnip_smile", CreativeTabs.FOOD);
        turnip_scared = new Turnips.Turnip_scared("turnip_scared", CreativeTabs.FOOD);
        turnip_bomb = new Turnips.Turnip_bomb("turnip_bomb", CreativeTabs.FOOD);
        turnip_stitch = new Turnips.Turnip_stitch("turnip_stitch", CreativeTabs.FOOD);
        turnip_wink = new Turnips.Turnip_wink("turnip_wink", CreativeTabs.FOOD);
        turnip_plain = new Turnips.Turnip_plain("turnip_plain", CreativeTabs.FOOD);
        turnip_sceptic = new Turnips.Turnip_sceptic("turnip_sceptic", CreativeTabs.FOOD);
        turnip_sleep = new Turnips.Turnip_sleep("turnip_sleep", CreativeTabs.FOOD);
        turnip_happy = new Turnips.Turnip_happy("turnip_happy", CreativeTabs.FOOD);



        //new Turnips("turnip", CreativeTabs.MATERIALS);
    }

    public static void register() {

        GameRegistry.register(turnip_smile);
        GameRegistry.register(turnip_scared);
        GameRegistry.register(turnip_bomb);
        GameRegistry.register(turnip_stitch);
        GameRegistry.register(turnip_wink);
        GameRegistry.register(turnip_plain);
        GameRegistry.register(turnip_sceptic);
        GameRegistry.register(turnip_sleep);
        GameRegistry.register(turnip_happy);
    }

    public static void registerRenders() {

        registerRender(turnip_smile);
        registerRender(turnip_scared);
        registerRender(turnip_bomb);
        registerRender(turnip_stitch);
        registerRender(turnip_wink);
        registerRender(turnip_plain);
        registerRender(turnip_sceptic);
        registerRender(turnip_sleep);
        registerRender(turnip_happy);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
