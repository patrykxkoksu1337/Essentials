package com.earth2me.essentials.components.commands.handlers;

import static com.earth2me.essentials.components.i18n.I18nComponent._;
import com.earth2me.essentials.components.commands.EssentialsCommand;
import com.earth2me.essentials.components.settings.users.IUserComponent;
import org.bukkit.event.entity.EntityDamageEvent;


public class Commandsuicide extends EssentialsCommand
{
	@Override
	public void run(final IUserComponent user, final String commandLabel, final String[] args) throws Exception
	{
		EntityDamageEvent ede = new EntityDamageEvent(user.getBase(), EntityDamageEvent.DamageCause.SUICIDE, 1000);
		getServer().getPluginManager().callEvent(ede);
		user.damage(1000);
		user.setHealth(0);
		user.sendMessage(_("suicideMessage"));
		getContext().getMessager().broadcastMessage(user,_("suicideSuccess", user.getDisplayName()));
	}
}
