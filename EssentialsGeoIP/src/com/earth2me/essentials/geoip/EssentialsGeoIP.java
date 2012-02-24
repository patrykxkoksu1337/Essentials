package com.earth2me.essentials.geoip;

import com.earth2me.essentials.api.EssentialsPlugin;
import com.earth2me.essentials.api.IContext;
import static com.earth2me.essentials.components.i18n.I18nComponent._;
import java.util.logging.Level;
import org.bukkit.plugin.PluginManager;


public class EssentialsGeoIP extends EssentialsPlugin
{
	public EssentialsGeoIP()
	{
	}

	@Override
	public void onDisable()
	{
	}

	@Override
	public void onEnable()
	{
		final PluginManager pluginManager = getServer().getPluginManager();
		final EssentialsGeoIPPlayerListener playerListener = new EssentialsGeoIPPlayerListener(this, getContext());
		pluginManager.registerEvents(playerListener, this);
		// TODO Add playerListener to reload list.

		getLogger().log(Level.INFO, "This product includes GeoLite data created by MaxMind, available from http://www.maxmind.com/.");
	}
}
