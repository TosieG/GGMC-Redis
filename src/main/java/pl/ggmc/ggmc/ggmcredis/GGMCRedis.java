package pl.ggmc.ggmc.ggmcredis;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class GGMCRedis extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "   _____    _____   __  __    _____ ");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "  / ____|  / ____| |  \\/  |  / ____|");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + " | |  __  | |  __  | \\  / | | |     ");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + " | | |_ | | | |_ | | |\\/| | | |     ");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + " | |__| | | |__| | | |  | | | |____ ");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "  \\_____|  \\_____| |_|  |_|  \\_____|");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_AQUA + " GGMC-REDIS Production " + getDescription().getVersion());
        getServer().getConsoleSender().sendMessage("");
        registerCommands();
        registerTabCompleters();
        registerEvents();
        registerConfig();
        getServer().getConsoleSender().sendMessage("[" + getDescription().getName() + "] Pomyślnie załadowano GGMC-REDIS");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "   _____    _____   __  __    _____ ");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "  / ____|  / ____| |  \\/  |  / ____|");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + " | |  __  | |  __  | \\  / | | |     ");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + " | | |_ | | | |_ | | |\\/| | | |     ");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + " | |__| | | |__| | | |  | | | |____ ");
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "  \\_____|  \\_____| |_|  |_|  \\_____|");
        getServer().getConsoleSender().sendMessage("");
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + " GGMC-REDIS Disabled");
        getServer().getConsoleSender().sendMessage("");
    }

    private void registerCommands() {
        //this.getCommand("ggmc").setExecutor(new Commandggmc());
    }

    private void registerTabCompleters() {

    }

    private void registerEvents() {
        //this.getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }

    private void registerConfig() {

    }
}
