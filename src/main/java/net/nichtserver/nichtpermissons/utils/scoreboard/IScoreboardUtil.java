package net.nichtserver.nichtpermissons.utils.scoreboard;

import org.bukkit.entity.Player;

public interface IScoreboardUtil {

    void set(Player player);

    void animate();

    void update(Player player);

}
