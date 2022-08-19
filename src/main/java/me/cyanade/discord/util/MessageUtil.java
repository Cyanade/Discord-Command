package me.cyanade.discord.util;

import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;

@UtilityClass
public class MessageUtil {

    public void sendLoad() {
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&7&m-------------------------------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&b  _____  _                       _ "));
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&b |  __ \\(_)                     | |"));
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&b | |  | |_ ___  ___ ___  _ __ __| |"));
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&b | |  | | / __|/ __/ _ \\| '__/ _` |"));
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&b | |__| | \\__ \\ (_| (_) | | | (_| |"));
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&b |_____/|_|___/\\___\\___/|_|  \\__,_|"));
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&7| &bIf you need any help don't hesitate to contact me at &7[Cyanade#7430]"));
        Bukkit.getConsoleSender().sendMessage(ColorUtil.translate("&7&m-------------------------------------------------------------"));
    }
}
