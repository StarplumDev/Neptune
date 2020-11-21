package network.starplum.messages;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.ClickEvent.Action;

public class ClickableMessage {
	
	public static void sendMessage(Player player, TextComponent component) { player.spigot().sendMessage(component); }
	
	public static TextComponent clickableMessage(String message, String url) {
		final TextComponent a = new TextComponent(message);
		a.setClickEvent(new ClickEvent(Action.OPEN_URL, url));
		return a;
	}

}
