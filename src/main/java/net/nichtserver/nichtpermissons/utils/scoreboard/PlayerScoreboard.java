package net.nichtserver.nichtpermissons.utils.scoreboard;

import net.nichtserver.nichtpermissons.NichtPermissons;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class PlayerScoreboard implements IScoreboardUtil {

    private NichtPermissons plugin;

    public PlayerScoreboard(NichtPermissons plugin) {
        this.plugin = plugin;
    }

    public Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();

    @Override
    public void set(Player player) {
        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
        scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("aaa", "bbb");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName("§f§lNichtServer");

        {
            Team team = scoreboard.registerNewTeam("x13");
            team.setPrefix("§8•§7● ");
            team.setSuffix("§7Spieler");
            team.addEntry("§1");

        }
        {
            Team team = scoreboard.registerNewTeam("x12");
            team.setPrefix("§8➜ §c");
            team.setSuffix("§c");
            team.addEntry("§f");
        }
        {
            Team team = scoreboard.registerNewTeam("x10");
            team.setPrefix("§8•§7● ");
            team.setSuffix("§7Coins");
            team.addEntry("§c");
        }
        {
            Team team = scoreboard.registerNewTeam("x9");
            team.setPrefix("§8➜ ");
            team.setSuffix("§c0" /*YOUR MONEY API*/);
            team.addEntry("§2");
        }
        {
            Team team = scoreboard.registerNewTeam("x7");
            team.setPrefix("§8•§7● ");
            team.setSuffix("§7Karma");
            team.addEntry("§3");
        }
        {
            Team team = scoreboard.registerNewTeam("x6");
            team.setPrefix("§8➜ §c");
            team.setSuffix("§c" + "12");
            team.addEntry("§4");
        }
        {
            Team team = scoreboard.registerNewTeam("x4");
            team.setPrefix("§8•§7● ");
            team.setSuffix("§7Karte");
            team.addEntry("§5");
        }
        {
            Team team = scoreboard.registerNewTeam("x3");
            team.setPrefix("§8➜ ");
            team.setSuffix("§c" + player.getName());
            team.addEntry("§6");
        }

        objective.getScore("§8§m----------------").setScore(11);
        objective.getScore("§1").setScore(10);
        objective.getScore("§f").setScore(9);
        objective.getScore("      ").setScore(8);
        objective.getScore("§c").setScore(7);
        objective.getScore("§2").setScore(6);
        objective.getScore("   ").setScore(5);
        objective.getScore("§3").setScore(4);
        objective.getScore("§4").setScore(3);
        objective.getScore("  ").setScore(2);
        objective.getScore("§5").setScore(1);
        objective.getScore("§6").setScore(0);

        player.setScoreboard(scoreboard);

    }

    private int taskId = 0;

    @Override
    public void animate() {
        plugin.getServer().getScheduler().scheduleAsyncRepeatingTask(plugin, new Runnable() {
            @Override
            public void run() {
                Bukkit.getOnlinePlayers().stream().forEach(players -> {
                    if (players.getScoreboard() == null || players.getScoreboard().getObjective(DisplaySlot.SIDEBAR) == null) {
                        return;
                    }
                });

                switch (taskId) {
                    case 0:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&f&lNICHTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 1:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&b&lN&f&lICHTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 2:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lN&b&lI&f&lCHTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 3:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNI&b&lC&f&lHTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 4:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNIC&b&lH&f&lTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 5:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICH&b&LT&f&LSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 6:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHT&b&lS&f&lERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 7:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTS&b&lE&f&lRVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 8:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSE&b&lR&f&lVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 9:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSER&b&lV&f&lER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 10:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSERV&b&lE&f&lR".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 11:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSERVE&b&lR".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 12:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 13:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSERVE&b&lR".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 14:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSERV&b&lE&f&lR".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 15:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSER&b&lV&f&lER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 16:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTSE&b&lR&f&lVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 17:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHTS&b&lE&f&lRVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 18:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICHT&b&lS&f&lERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 19:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNICH&b&LT&f&LSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 20:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNIC&b&lH&f&lTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 21:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lNI&b&lC&f&lHTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 22:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&3&lN&b&lI&f&lCHTSERVER".replaceAll("&", "§"));
                        });
                        taskId++;
                        break;
                    case 23:
                        Bukkit.getOnlinePlayers().stream().forEach(players -> {
                            players.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName("&b&lN&f&lICHTSERVER".replaceAll("&", "§"));
                        });
                        taskId = 0;
                        break;
                }
            }
        }, 10L, 10L);
    }

    @Override
    public void update(Player player) {
        if (player.getScoreboard() == null || player.getScoreboard().getObjective(DisplaySlot.SIDEBAR) == null) {
            return;
        }
        player.getScoreboard().getTeam("x12").setSuffix("§c" + 2);
    }
}
