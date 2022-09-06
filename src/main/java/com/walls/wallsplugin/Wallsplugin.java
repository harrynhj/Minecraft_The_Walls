package com.walls.wallsplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Wallsplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[The Walls] Plugin Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[The Walls] Plugin Disabled");
    }
}
