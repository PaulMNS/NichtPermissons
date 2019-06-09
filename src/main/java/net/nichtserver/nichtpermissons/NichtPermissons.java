package net.nichtserver.nichtpermissons;

import net.nichtserver.nichtpermissons.listeners.PlayerListeners;
import net.nichtserver.nichtpermissons.managers.EventManager;
import net.nichtserver.nichtpermissons.utils.scoreboard.PlayerScoreboard;
import net.nichtserver.nichtpermissons.utils.scoreboard.TablistManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NichtPermissons extends JavaPlugin {

    private PlayerScoreboard playerScoreboard;
    private TablistManager tablistManager;
    private EventManager eventManager;

    @Override
    public void onEnable() {
        init();
        initListeners();
        initCommands();
    }

    //<editor-fold defaultstate="collapsed" desc="init">
    private void init() {
        playerScoreboard = new PlayerScoreboard(this);
        tablistManager = new TablistManager(this);
        eventManager = new EventManager(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="initListeners">
    private void initListeners() {
        new PlayerListeners(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="initCommands">
    private void initCommands() {
        
    }
    //</editor-fold>
    
    public PlayerScoreboard getPlayerScoreboard() {
        return playerScoreboard;
    }
    
    public TablistManager getTablistManager() {
        return tablistManager;
    }

    public EventManager getEventManager() {
        return eventManager;
    }
}
