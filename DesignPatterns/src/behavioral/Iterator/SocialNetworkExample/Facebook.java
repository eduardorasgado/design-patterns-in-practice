package behavioral.Iterator.SocialNetworkExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class Facebook implements SocialNetwork {
	private List<Profile> profiles;
	private Map<ProfileType, Function<String, ProfileIterator>> methodMap;
	private Map<ProfileType, Function<String, List<Profile>>> profileMap;

	public Facebook() {
		profiles = new ArrayList<>();

		methodMap = new HashMap<>();
		methodMap.put(ProfileType.FRIEND, (profileId) -> createFriendsIterator(profileId));
		methodMap.put(ProfileType.COWORKER, (profileId) -> createCoworkersIterator(profileId));

		profileMap = new HashMap<>();
		profileMap.put(ProfileType.FRIEND, (profileId) -> getFriends(profileId));
		profileMap.put(ProfileType.COWORKER, (profileId) -> getCoworkers(profileId));
	}

	private List<Profile> getCoworkers(String profileId) {
		List<Profile> coworkers = new ArrayList<>();
		for (Profile profile : profiles) {
			if (profile.getId().equals(profileId)) {
				coworkers = profile.getCoworkers();
			}
		}
		return coworkers;

	}

	private List<Profile> getFriends(String profileId) {
		List<Profile> friends = new ArrayList<>();
		for (Profile profile : profiles) {
			if (profile.getId().equals(profileId)) {
				friends = profile.getFriends();
			}
		}
		return friends;
	}

	private ProfileIterator createFriendsIterator(String profileId) {
		return new FacebookIterator(this, profileId, ProfileType.FRIEND);
	}

	private ProfileIterator createCoworkersIterator(String profileId) {
		return new FacebookIterator(this, profileId, ProfileType.COWORKER);
	}

	public ProfileIterator getIterator(String profileId, ProfileType profileType) {
		return methodMap.get(profileType).apply(profileId);
	}

	public List<Profile> socialGraphRequest(String profileId, ProfileType profileType) {
		return profileMap.get(profileType).apply(profileId);
	}

	@Override
	public void addProfiles(List<Profile> profiles) {
		this.profiles.addAll(profiles);
	}
}
