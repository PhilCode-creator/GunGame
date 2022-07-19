package de.philcode.gungame.listener;

import de.philcode.gungame.GunGame;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Event_UpdateKit implements Listener {

    @EventHandler
    public void onWater(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if(player.getLocation().add(0, -1,0).getBlock().getType() == Material.WATER) {
            player.setHealth(0);
        }
    }

    @EventHandler
    public void onDeath(EntityDeathEvent event) {
        if(!(event.getEntity() instanceof Player)) {
            return;
        }
        Player player = (Player) event.getEntity();
        if(player.getKiller() == null) {
            Bukkit.broadcastMessage(GunGame.prefix + "§a" + player.getDisplayName() + " §sdied.");

        }
    }

}
