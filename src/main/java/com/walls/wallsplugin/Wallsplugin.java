package com.walls.wallsplugin;

import com.walls.wallsplugin.commands.MainCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Wallsplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[The Walls] Plugin Enabled");
        getCommand("thewalls").setExecutor(new MainCommand());
        System.out.println("111");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[The Walls] Plugin Disabled");
    }
}
