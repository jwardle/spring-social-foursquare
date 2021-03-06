package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import org.springframework.social.foursquare.api.Venue;

public class VenueContainerDeserializer extends AbstractFoursquareDeserializer<VenueContainer> {
	@Override
	public VenueContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return new VenueContainer(deserializeNestedResponseObject(jp, "venue", Venue.class));
	}
}
