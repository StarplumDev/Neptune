package network.starplum.messages;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.HoverEvent.Action;
import net.md_5.bungee.api.chat.TextComponent;

public class HoverableMessage {

	public static void sendMessage(Player player, TextComponent component) { player.spigot().sendMessage(component); }
	
	public static TextComponent hoverableMessage(String message, String hover) {
		final TextComponent a = new TextComponent(message);
		a.setHoverEvent(new HoverEvent(Action.SHOW_TEXT, new ComponentBuilder(hover).create()));
		return a;
	}
	
}
