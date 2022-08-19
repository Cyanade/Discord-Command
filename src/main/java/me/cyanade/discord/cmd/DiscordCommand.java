package me.cyanade.discord.cmd;

import me.cyanade.discord.Discord;
import me.cyanade.discord.util.ColorUtil;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

            Player player = (Player) commandSender;

            final TextComponent discord = new TextComponent(ColorUtil.translate(Discord.getInstance().getDiscordMessage()));

        discord.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, Discord.getInstance().getLink()));

            if (Discord.getInstance().isDiscordHover()) {

                final StringBuilder stringBuilder = new StringBuilder();
                int listSize = Discord.getInstance().getDiscordHoverMessage().size();
                int i = 1;

                for (final String hoverMessages : Discord.getInstance().getDiscordHoverMessage()) {
                    if (i == listSize) {
                        stringBuilder.append(hoverMessages);
                    } else {
                        stringBuilder.append(hoverMessages).append("\n");
                    }
                    i++;
                }

                discord.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ColorUtil.translate(stringBuilder.toString())).create()));
            }

            //commandSender.spigot().sendMessage(discord);
            player.spigot().sendMessage(discord);

            return true;

    }
}
