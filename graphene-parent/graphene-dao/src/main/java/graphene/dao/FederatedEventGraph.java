package graphene.dao;

import graphene.services.EventGraphBuilder;

import org.apache.tapestry5.ioc.annotations.UsesConfiguration;

@UsesConfiguration(EventGraphBuilder.class)
public interface FederatedEventGraph {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();

	public abstract void printDatasetsSupported();

}