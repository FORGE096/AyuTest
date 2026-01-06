package dev.yourteam.plugins.ayutest;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ayutest extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }




    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        if (event.getPlayer().getName().equals("FORGE096")) {
            // PlayerJoinEvent cannot be cancelled, kicking player instead
            event.getPlayer().kickPlayer("You are not allowed to join this server");
        }
    }


}
