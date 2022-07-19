package de.philcode.gungame;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class GunGame extends JavaPlugin {

    HashMap<Player, Integer> kits = new HashMap<>();

    public static final String prefix = "§8[§2GunGame§8] §r";

    public static final String noPerms = prefix + "§cYou do not have enough permission to Execute this!";

    public static final String noPlayer = prefix + "§cYoure not a Player!";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§8[]==========[§2GunGame§8]==========[]\n" +
                                                 "§dVersion: " + this.getDescription().getVersion() + "\n" +
                                                 "\n" +
                                                 "§3Author: PhilCode\n" +
                                                 "\n" +
                                                 "§eStatus: §aEnabled");
        Bukkit.getWorld("world").setGameRule(GameRule.ANNOUNCE_ADVANCEMENTS, false);
        Bukkit.getWorld("world").setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§8[]==========[§2GunGame§8]==========[]\n" +
                "§dVersion: " + this.getDescription().getVersion() + "\n" +
                "\n" +
                "§3Author: PhilCode\n" +
                "\n" +
                "§eStatus: §cDisabled");
    }

    private void register() {
        PluginManager pluginManager = Bukkit.getPluginManager();

    }

}
