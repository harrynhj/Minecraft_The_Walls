package com.walls.wallsplugin.events;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Move implements Listener {
    @EventHandler
    public void PlayerMoveEvent (PlayerMoveEvent move) {
        double to_x = move.getTo().getX();
        double to_y = move.getTo().getY();
        double to_z = move.getTo().getZ();

        double from_x = move.getFrom().getX();
        double from_y = move.getFrom().getY();
        double from_z = move.getFrom().getZ();

        Location loc = move.getPlayer().getLocation();

        move.getPlayer().sendMessage(ChatColor.GREEN + "from: " + Math.round(from_x) + ", " + Math.round(from_y) + ", " + Math.round(from_z));
        move.getPlayer().sendMessage(ChatColor.GREEN + "to: " + Math.round(to_x) + ", " + Math.round(to_y) +  ", " + Math.round(to_z));
        if (to_y > 255) {
            move.getPlayer().teleport(loc);
            move.getPlayer().sendMessage(ChatColor.RED + "Too high");
        }

}

}
