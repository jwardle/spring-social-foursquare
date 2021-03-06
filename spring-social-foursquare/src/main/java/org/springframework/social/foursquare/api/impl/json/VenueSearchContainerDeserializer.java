package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import org.springframework.social.foursquare.api.Venue;

public class VenueSearchContainerDeserializer extends AbstractFoursquareDeserializer<VenueSearchContainer> {
    
	@SuppressWarnings("unchecked") 
	@Override
	public VenueSearchContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
	    List<Venue>result = (List<Venue>) deserializeNestedList(jp, "venues", new TypeReference<List<Venue>>(){});
		return new VenueSearchContainer(result);
	}
}
