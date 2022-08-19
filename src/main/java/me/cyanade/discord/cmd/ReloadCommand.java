package me.cyanade.discord.cmd;

import me.cyanade.discord.Discord;
import me.cyanade.discord.util.ColorUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.hasPermission("discord.reload") || commandSender.isOp()) {
            commandSender.sendMessage(ColorUtil.translate("&bReloading Discord &7config.yml&b!"));
            Discord.getInstance().saveDefaultConfig();
            Discord.getInstance().reloadConfig();
            Discord.getInstance().loadConfig();
            commandSender.sendMessage(ColorUtil.translate("&bDone!"));
            return true;
        } else {
            commandSender.sendMessage(ColorUtil.translate(Discord.getInstance().getPermission()));
            return true;
        }
    }
}
