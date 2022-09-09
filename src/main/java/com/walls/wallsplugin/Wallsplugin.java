package com.walls.wallsplugin;

import com.walls.wallsplugin.commands.MainCommand;
import com.walls.wallsplugin.events.Move;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Wallsplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Generate config

        saveDefaultConfig();

        FileConfiguration config = this.getConfig();


        // Register commands
        getCommand("thewalls").setExecutor(new MainCommand());
        getCommand("thewalls").setTabCompleter(new MainCommand());
        getServer().getPluginManager().registerEvents(new Move(), this);
        System.out.println("[The Walls] Plugin Enabled");
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[The Walls] Plugin Disabled");
    }
}
