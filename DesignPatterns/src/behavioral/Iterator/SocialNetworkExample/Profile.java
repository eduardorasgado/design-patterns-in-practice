package behavioral.Iterator.SocialNetworkExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Profile {

	private String id;
	private String email;
	private List<Profile> coworkers;
	private List<Profile> friends;

	private Map<ProfileType, Consumer<Profile>> addToNetworkMap;

	public Profile(String id, String email) {
		this.id = id;
		this.email = email;
		coworkers = new ArrayList<>();
		friends = new ArrayList<>();

		addToNetworkMap = new HashMap<>();
		addToNetworkMap.put(ProfileType.FRIEND, (profile) -> getFriends().add(profile));
		addToNetworkMap.put(ProfileType.COWORKER, (profile) -> getCoworkers().add(profile));
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public List<Profile> getCoworkers() {
		return coworkers;
	}

	public List<Profile> getFriends() {
		return friends;
	}

	public void addToNetwork(Profile profile, ProfileType profileType) {
		addToNetworkMap.get(profileType).accept(profile);
	}
}
