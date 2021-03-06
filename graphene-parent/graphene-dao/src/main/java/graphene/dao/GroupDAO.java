package graphene.dao;

import graphene.model.idl.G_Group;

import java.util.List;

public interface GroupDAO {
	public G_Group createGroup(G_Group g);

	public G_Group save(G_Group g);

	public void deleteGroup(G_Group g);

	public G_Group getGroupByGroupname(String groupname);

	public List<G_Group> getAllGroups();

	boolean addToGroup(String username, String groupname);

	boolean removeFromGroup(String username, String groupname);

	List<G_Group> getGroupsForUser(String username);
}
