package net.nichtserver.nichtpermissons.managers;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import net.nichtserver.nichtpermissons.NichtPermissons;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class EventManager implements Listener {

    private NichtPermissons plugin;

    private final HashMap<EventListener, CopyOnWriteArrayList<ListenerExecutor>> executors;

    public EventManager(NichtPermissons plugin) {
        this.plugin = plugin;
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.executors = new HashMap<>();
    }

    //<editor-fold defaultstate="collapsed" desc="registerEvent">
    public void registerEvent(Class<? extends Event> cls, EventListener listener) {
        ListenerExecutor executor = new ListenerExecutor(cls, listener);

        this.plugin.getServer().getPluginManager().registerEvent(cls, new Listener() {

        }, EventPriority.NORMAL, executor, this.plugin);
        if (!this.executors.containsKey(listener)) {
            this.executors.put(listener, new CopyOnWriteArrayList<>());
        }
        this.executors.get(listener).add(executor);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="unregisterEvent">
    public void unregisterEvent(Class<? extends Event> cls, EventListener listener) {
        if (!this.executors.containsKey(listener)) {
            return;
        }
        this.executors.get(listener).stream().filter((executor) -> (executor.getListener().equals(listener))).forEach((executor) -> {
            executor.setDisable(true);
        });
    }
    //</editor-fold>

    public interface EventListener<T extends Event> {
        public void on(T event);
    }
}
