package com.earth2me.essentials.components.commands.handlers;

import static com.earth2me.essentials.I18nComponent._;
import com.earth2me.essentials.api.IBackupComponent;
import com.earth2me.essentials.components.commands.EssentialsCommand;
import org.bukkit.command.CommandSender;


public class Commandbackup extends EssentialsCommand
{
	@Override
	protected void run(final CommandSender sender, final String commandLabel, final String[] args) throws Exception
	{
		final IBackupComponent backup = getContext().getBackup();
		backup.run();
		sender.sendMessage(_("backupStarted"));
	}
}