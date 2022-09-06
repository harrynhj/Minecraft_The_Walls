package com.walls.wallsplugin.events;


import org.bukkit.ChatColor;
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

        move.getPlayer().sendMessage(ChatColor.GREEN + "from: " + from_x + from_y + from_z);
        move.getPlayer().sendMessage(ChatColor.GREEN + "to: " + to_x + to_y + to_z);
}

}
