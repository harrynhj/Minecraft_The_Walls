package com.walls.wallsplugin.commands;

import com.walls.wallsplugin.Wallsplugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCommand implements CommandExecutor, TabExecutor, Listener {
    @Override
    public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.GOLD + "The Walls");
            sender.sendMessage(ChatColor.GOLD + "Plugin Version: 1.0SNAPSHOT");
            sender.sendMessage(ChatColor.GOLD + "Author: Cooky_qi_e");
            sender.sendMessage(ChatColor.GOLD + "Use /thewalls help [page] to check commands");
            return true;
        } else if (args.length > 2) {
            sender.sendMessage(ChatColor.RED + "Unknown Command");
            return false;
        }

        switch (args[0]) {
            case "help" :
                if (!sender.hasPermission("thewalls.help")) {
                    sender.sendMessage(ChatColor.RED + "You do not have permission to use this command");
                    return false;
                }
                sender.sendMessage(ChatColor.GOLD+ "-------------The Walls-------------");
                sender.sendMessage(ChatColor.AQUA + "/thewalls status [arena_name]" + ChatColor.WHITE + "-----Check arena status");
                sender.sendMessage(ChatColor.AQUA + "/thewalls join [arena_name]" + ChatColor.WHITE + "-------Join a game");
                sender.sendMessage(ChatColor.AQUA + "/thewalls leave" + ChatColor.WHITE + "------------------Leave current game");
                sender.sendMessage(ChatColor.AQUA + "/thewalls list" + ChatColor.WHITE + "--------------------List all arena");
                sender.sendMessage(ChatColor.AQUA + "/thewalls create" + ChatColor.WHITE + "-----------------Create arena");
                sender.sendMessage(ChatColor.AQUA + "/thewalls delete [arena_name]" + ChatColor.WHITE + "----Delete arena");
                sender.sendMessage(ChatColor.AQUA + "/thewalls abort [arena_name]" + ChatColor.WHITE + "------Force stop a game");
                sender.sendMessage(ChatColor.AQUA + "/thewalls reload" + ChatColor.WHITE + "------------------Reload Plugin");
                return true;
            case "status" :
                break;
            case "join" :
                break;
            case "leave" :
                break;
            case "list" :
                break;
            case "create" :
                Player player = (Player)sender;
                ItemStack stick = new ItemStack(Material.STICK,1);
                ItemMeta meta = stick.getItemMeta();
                meta.setDisplayName("§btool");
                List<String> temp = new ArrayList<String>();
                temp.add("§d Use this tool to select game area");
                meta.setLore(temp);
                stick.setItemMeta(meta);
                player.getInventory().addItem(stick);
                sender.sendMessage(ChatColor.GOLD + "Use tool left click the first position");
                break;
            case "delete" :
                break;
            case "abort" :
                break;
            case "reload" :
                break;
            default :
                sender.sendMessage(ChatColor.RED + "Unknown Commands");
                return false;
        }
        return false;

    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 1) {
            List<String> temp = new ArrayList<>();
            temp.add("help");
            temp.add("status");
            temp.add("join");
            temp.add("leave");
            temp.add("list");
            temp.add("create");
            temp.add("delete");
            temp.add("abort");
            return temp;
        }
        return null;
    }
}
