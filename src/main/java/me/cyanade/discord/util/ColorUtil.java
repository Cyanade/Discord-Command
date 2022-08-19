package me.cyanade.discord.util;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public final class ColorUtil {

    public String translate(final String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public static ArrayList<String> translate(List<String> message) {
        ArrayList<String> list = new ArrayList<>();
        for (String string : message) {
            list.add(translate(string));
        }
        return list;
    }
}