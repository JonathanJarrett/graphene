package graphene.model.query;

import graphene.model.idl.G_Delimiter;
import graphene.model.idl.G_SearchTuple;
import graphene.model.idl.G_SearchType;
import graphene.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is an experimental class is to aid in creating flexible rest URLs that
 * perform multiple value searches/search types which can be called using REST.
 * 
 * The alternative, which is more flexible but is not really in the intent of
 * REST, is to POST JSON which has your search query terms and types.
 * 
 * @author djue
 * 
 */
public class SearchTypeHelper {
	private static Logger logger = LoggerFactory
			.getLogger(SearchTypeHelper.class);

	private SearchTypeHelper() {
		// TODO Auto-generated constructor stub
	}

	public static List<G_SearchTuple<String>> processSearchList(
			String multiTermString, G_SearchType defaultSearchType) {
		List<G_SearchTuple<String>> list = new ArrayList<G_SearchTuple<String>>(
				2);
		for (String s : StringUtils.tokenizeToStringCollection(multiTermString,
				G_Delimiter.MULTIPLE_VALUE.getValueString())) {
			G_SearchTuple<String> tuple;
			try {
				tuple = SearchTypeHelper
						.processSearchType(s, defaultSearchType);
				list.add(tuple);
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
		return list;
	}

	public static G_SearchTuple<String> processSearchType(
			String originalString, G_SearchType defaultSearchType)
			throws Exception {
		// Build from scratch since we don't know if it's malformed.
		G_SearchTuple<String> tuple = new G_SearchTuple<String>();
		String[] array = StringUtils.tokenizeToStringArray(originalString,
				G_Delimiter.SEARCH_TYPE.getValueString());
		if (array == null) {
			return null;
		} else if (array.length == 1) {
			// No search type specified, use the default search type
			tuple.setSearchType(defaultSearchType);
			tuple.setValue(array[1]);
		} else if (array.length == 2) {
			tuple.setSearchType(G_SearchType.fromValue(array[0]));
			tuple.setValue(array[1]);
		} else {
			throw new Exception("Error parsing search type");
		}

		return tuple;
	}
}
