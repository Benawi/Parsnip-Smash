package com.functionstorm.turnip_smash.proxy;

import com.functionstorm.turnip_smash.handlers.ItemHandler;

public class ClientProxy extends CommonProxy {
    public void init() {
        ItemHandler.registerRenders();

    }
}
