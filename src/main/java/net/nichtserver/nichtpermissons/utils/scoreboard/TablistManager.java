package net.nichtserver.nichtpermissons.utils.scoreboard;

import net.nichtserver.nichtpermissons.NichtPermissons;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class TablistManager {

    private NichtPermissons plugin;

    public TablistManager(NichtPermissons plugin) {
        this.plugin = plugin;
    }
    
    public void setTablist(Player player) {
        if(player.getScoreboard() == null){
            plugin.getPlayerScoreboard().set(player);
        }

        Scoreboard board = player.getScoreboard();

        Team admin = board.registerNewTeam("a");
        Team spieler = board.registerNewTeam("b");

        admin.setPrefix("§4§lAdmin §8● §4");
        spieler.setPrefix("§eSpieler §8● §e");

        for(Player all : Bukkit.getOnlinePlayers()){
            if(all.isOp())
            {
                admin.addEntry(all.getName());
            }

            if(!all.isOp())
            {
                spieler.addEntry(all.getName());
            }
        }
    }

    public void updateTablist(Player player) {
        if(player.getScoreboard() == null){
            plugin.getPlayerScoreboard().set(player);
        }

        Scoreboard board = player.getScoreboard();

        if(board.getTeam("a") == null || board.getTeam("b") == null) {
            setTablist(player);
        }

        Team admin = board.getTeam("a");
        Team spieler = board.getTeam("b");

        for(Player all : Bukkit.getOnlinePlayers()){
            if(all.isOp())
            {
                admin.addEntry(all.getName());
            }

            if(!all.isOp())
            {
                spieler.addEntry(all.getName());
            }
        }
    }
}
