package network.starplum.messages;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class ChatComponent {
	
	public static void sendMessage(Player player, TextComponent component) { player.spigot().sendMessage(component); }
	
	public static TextComponent createComponent(String message) {
		final TextComponent a = new TextComponent(message);
		return a;
	}
	
	public static TextComponent createComponent(String message, String hoverable) {
		final TextComponent a = new TextComponent(message);
		a.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(hoverable).create()));
		return a;
	}
	
	public static TextComponent createComponent(String message, String hoverable, String clickable) {
		final TextComponent a = new TextComponent(message);
		a.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(hoverable).create()));
		a.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, clickable));
		return a;
	}
	
	public static TextComponent createComponent(String message, String hoverable, String clickable, boolean run) {
		final TextComponent a = new TextComponent(message);
		a.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(hoverable).create()));
		if(run) { a.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, clickable)); } 
		else { a.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, clickable)); }
		return a;
	}

}
