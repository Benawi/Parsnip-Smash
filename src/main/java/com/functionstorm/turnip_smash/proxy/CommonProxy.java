package com.functionstorm.turnip_smash.proxy;

import com.functionstorm.turnip_smash.handlers.ItemHandler;

public class CommonProxy implements IProxy {

    public void preInit() {
        ItemHandler.init();
        ItemHandler.register();
    }

    public void init() {

    }

    public void postInit() {

    }
}
