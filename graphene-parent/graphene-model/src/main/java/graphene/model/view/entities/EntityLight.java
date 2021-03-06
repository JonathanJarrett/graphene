package graphene.model.view.entities;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import mil.darpa.vande.generic.V_IdProperty;

/**
 * Version of Entity that contains lists of EntityAttributes 
 * - i.e. it contains lists of String properties rather than typed objects 
 * @author PWG for DARPA
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EntityLight {
	private String id = null;
	private Set<EntityAttribute> attributes = new HashSet<EntityAttribute>();
	private Set<String> accountList = new HashSet<String>();
	private String datasource_id = null;
	private String effectiveName = null;

	public EntityLight(Entity e) {
		this.setId(e.getId());
		this.setDatasource_id(e.getDatasourceId());
		for (Name p: e.getNameList()) {
			String n = p.getFullName();
			attributes.add(new EntityAttribute("Name", "", n));
			
			// set the effectiveName to be the shortest one.  
			if (effectiveName == null)
				effectiveName = n;
			else {
				if (n.length() < effectiveName.length())
					effectiveName = n;					
			}

			
		}
		for (CommunicationId p: e.getCommunicationIdList())
			attributes.add(new EntityAttribute("CommunicationId", "", p.getValue()));
		for (Identifier p: e.getAddressList())
			attributes.add(new EntityAttribute("Address", "", p.getFullAddress()));
		for (EmailAddress p: e.getEmailList())
			attributes.add(new EntityAttribute("Email", "", p.getFullAddress()));
		for (V_IdProperty p:e.getIdentList()) {
			attributes.add(new EntityAttribute("Identifier", p.getIdName(), p.getIdValue()));
		}
		for (Account ac:e.getAccountList()) {
			accountList.add(ac.getAccountNumber());
		}
			
		

	}

	public String getEffectiveName() {
		return effectiveName;
	}

	public void setEffectiveName(final String effectiveName) {
		this.effectiveName = effectiveName;
	}

	public String getDatasource_id() {
		return datasource_id;
	}

	public void setDatasource_id(final String datasource_id) {
		this.datasource_id = datasource_id;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}
	public Set<String> getAccountList() {
		return accountList;
	}

	public void setAccountList(final Set<String> accountList) {
		this.accountList = accountList;
	}

	public Set<EntityAttribute> getAttributes() {
		return attributes;
	}
}
