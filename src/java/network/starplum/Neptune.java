package network.starplum;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author iDevMC {@link (https://github.com/iDevMC)}
 * @version 1.0
 */
public class Neptune extends JavaPlugin {

	public Neptune() {}
	
	@Override public String toString() { return "Neptune by Starplum"; }
	@Override protected Object clone() throws CloneNotSupportedException { return super.clone(); }
	@Override protected void finalize() throws Throwable { super.finalize(); }
	
	private static Neptune neptune;
	public static Neptune getNeptune() { return neptune; }

	@Override public void onLoad() {}
	@Override public void onEnable() { neptune = this; }
	@Override public void onDisable() {}
	
}
