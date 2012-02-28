package com.earth2me.essentials.components.jails;

import com.earth2me.essentials.components.settings.users.IUserComponent;
import com.earth2me.essentials.components.IComponent;
import java.util.Collection;
import org.bukkit.Location;


public interface IJailsComponent extends IComponent
{
	Location getJail(String jailName) throws Exception;

	Collection<String> getList() throws Exception;

	void removeJail(String jail) throws Exception;

	void sendToJail(IUserComponent user, String jail) throws Exception;

	void setJail(String jailName, Location loc) throws Exception;
}
