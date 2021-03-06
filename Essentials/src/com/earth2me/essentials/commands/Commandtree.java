package com.earth2me.essentials.commands;

import static com.earth2me.essentials.I18n._;
import com.earth2me.essentials.api.IUser;
import com.earth2me.essentials.utils.LocationUtil;
import org.bukkit.Location;
import org.bukkit.TreeType;


public class Commandtree extends EssentialsCommand
{
	@Override
	public void run(final IUser user, final String commandLabel, final String[] args) throws Exception
	{
		TreeType tree;
		if (args.length < 1)
		{
			throw new NotEnoughArgumentsException();
		}
		else if (args[0].equalsIgnoreCase("birch"))
		{
			tree = TreeType.BIRCH;
		}
		else if (args[0].equalsIgnoreCase("redwood"))
		{
			tree = TreeType.REDWOOD;
		}
		else if (args[0].equalsIgnoreCase("tree"))
		{
			tree = TreeType.TREE;
		}
		else if (args[0].equalsIgnoreCase("redmushroom"))
		{
			tree = TreeType.RED_MUSHROOM;
		}
		else if (args[0].equalsIgnoreCase("brownmushroom"))
		{
			tree = TreeType.BROWN_MUSHROOM;
		}
		else
		{
			throw new NotEnoughArgumentsException();
		}

		final Location loc = LocationUtil.getTarget(user);
		final Location safeLocation = LocationUtil.getSafeDestination(loc);
		final boolean success = user.getWorld().generateTree(safeLocation, tree);
		if (success)
		{
			user.sendMessage(_("treeSpawned"));
		}
		else
		{
			user.sendMessage(_("treeFailure"));
		}
	}
}
