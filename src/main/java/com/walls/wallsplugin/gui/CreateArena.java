package com.walls.wallsplugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.Inventory;

public class CreateArena implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Inventory gui = Bukkit.createInventory(null, 6*9, "Setting");
        return false;
    }
}
