package me.cyanade.discord;

import lombok.Getter;
import me.cyanade.discord.cmd.DiscordCommand;
import me.cyanade.discord.cmd.ReloadCommand;
import me.cyanade.discord.util.MessageUtil;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class Discord extends JavaPlugin {

    private static Discord instance;

    public static Discord getInstance() {
        return instance;
    }

    public String discordMessage, permission, link;
    public boolean discordHover;
    public List<String> discordHoverMessage = new ArrayList<>();

    public void loadConfig() {
        link = getConfig().getString("discord.link");
        discordMessage = getConfig().getString("discord.message");
        discordHover = getConfig().getBoolean("discord.hover.enabled");
        discordHoverMessage = getConfig().getStringList("discord.hover.message");
        permission = getConfig().getString("discord.permission");
    }

    @Override
    public void onEnable() {

        MessageUtil.sendLoad();

        instance = this;

        saveDefaultConfig();

        loadConfig();

        Objects.requireNonNull(getCommand("discord")).setExecutor(new DiscordCommand());
        Objects.requireNonNull(getCommand("discordreload")).setExecutor(new ReloadCommand());

    }

    @Override
    public void onDisable() {

    }
}
