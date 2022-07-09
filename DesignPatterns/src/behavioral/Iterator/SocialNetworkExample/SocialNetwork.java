package behavioral.Iterator.SocialNetworkExample;

import java.util.List;

public interface SocialNetwork {

	ProfileIterator getIterator(String id, ProfileType profileType);
	
	void addProfiles(List<Profile> profiles);
}
