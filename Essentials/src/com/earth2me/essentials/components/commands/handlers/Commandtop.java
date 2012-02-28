package com.earth2me.essentials.components.commands.handlers;

import static com.earth2me.essentials.components.i18n.I18nComponent._;
import com.earth2me.essentials.Trade;
import com.earth2me.essentials.components.commands.EssentialsCommand;
import com.earth2me.essentials.components.settings.users.IUserComponent;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;


public class Commandtop extends EssentialsCommand
{
	@Override
	public void run(final IUserComponent user, final String commandLabel, final String[] args) throws Exception
	{
		final int topX = user.getLocation().getBlockX();
		final int topZ = user.getLocation().getBlockZ();
		final int topY = user.getWorld().getHighestBlockYAt(topX, topZ);
		user.getTeleport().teleport(new Location(user.getWorld(), user.getLocation().getX(), topY + 1, user.getLocation().getZ()), new Trade(getCommandName(), getContext()), TeleportCause.COMMAND);
		user.sendMessage(_("teleportTop"));
	}
}
