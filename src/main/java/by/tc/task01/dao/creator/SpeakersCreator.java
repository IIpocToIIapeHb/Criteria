package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.Criteria;

public class SpeakersCreator implements ApplianceCreator {

	@Override
	public Speakers create(Criteria parsedCriteria) {
		Speakers speakers = new Speakers();
		speakers.setPowerConsumption((Integer) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
		speakers.setNumberOfSpeakers((Integer) parsedCriteria.getCriteria().get("NUMBER_OF_SPEAKERS"));
		speakers.setFrequencyRange((String) parsedCriteria.getCriteria().get("FREQUENCY_RANGE"));
		speakers.setCordLength((Integer) parsedCriteria.getCriteria().get("CORD_LENGTH"));
		return speakers;
	}

}
