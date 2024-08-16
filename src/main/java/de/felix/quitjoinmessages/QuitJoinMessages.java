package de.felix.quitjoinmessages;

import de.felix.quitjoinmessages.Listener.QuitJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuitJoinMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        saveDefaultConfig();
        pluginManager.registerEvents(new QuitJoinListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
