package net.nichtserver.nichtpermissons.listeners;

import net.nichtserver.nichtpermissons.NichtPermissons;
import net.nichtserver.nichtpermissons.managers.EventManager;
import net.nichtserver.nichtpermissons.utils.scoreboard.TablistManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListeners {

    private NichtPermissons plugin;

    public PlayerListeners(NichtPermissons plugin) {
        this.plugin = plugin;
        loadListeners();
    }
    
    private void loadListeners() {
        plugin.getEventManager().registerEvent(PlayerJoinEvent.class, (EventManager.EventListener<PlayerJoinEvent>) (PlayerJoinEvent event) -> {
            Player player = event.getPlayer();
            plugin.getPlayerScoreboard().set(player);
            new TablistManager(plugin).setTablist(player);
            Bukkit.getOnlinePlayers().stream().forEach(players -> {
               plugin.getTablistManager().updateTablist(players);
               plugin.getPlayerScoreboard().update(players);
            });
        });
    }
}
