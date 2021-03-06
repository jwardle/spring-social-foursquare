package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import org.springframework.social.foursquare.api.Checkin;

public class CheckinContainerDeserializer extends AbstractFoursquareDeserializer<CheckinContainer> {
	@Override
	public CheckinContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		CheckinContainer result = new CheckinContainer(deserializeNestedResponseObject(jp, "checkin", Checkin.class));
		return result;
	}
}
