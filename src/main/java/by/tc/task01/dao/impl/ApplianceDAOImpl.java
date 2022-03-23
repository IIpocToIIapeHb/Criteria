package by.tc.task01.dao.impl;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.CriteriaParser;
import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.dao.creator.ApplianceCreatorFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

    private String filePath;
    private CriteriaParser parser;

    public ApplianceDAOImpl(CriteriaParser parser, String filePath) {
        this.parser = parser;
        this.filePath = filePath;
    }

    public List<Appliance> find(Criteria criteria) throws DAOException {

        List<Appliance> foundedAppliances = new ArrayList<Appliance>();
        BufferedReader bufferedReader = null;

        try {

            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String lineFromFile = bufferedReader.readLine();

            while (lineFromFile != null) {

                if (!lineFromFile.isEmpty()) {

                    Criteria criteriaFromLine = parser.parseToCriteria(lineFromFile);

                    if (match(criteriaFromLine, criteria)) {

                        ApplianceCreator applianceCreator = ApplianceCreatorFactory
                                .create(criteriaFromLine.getGroupSearchName());
                        Appliance foundedAppliance = applianceCreator.create(criteriaFromLine);

                        foundedAppliances.add(foundedAppliance);

                    }

                }
                lineFromFile = bufferedReader.readLine();
            }
            return foundedAppliances;

        } catch (IOException e) {
            throw new DAOException("File is not found", e);

        } finally {

            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean match(Criteria criteriaFromLine, Criteria criteria) {


        if (!criteria.getGroupSearchName().equals(criteriaFromLine.getGroupSearchName())) {
            return false;
        }

        for (Map.Entry<String, Object> criteriaProperty : criteria.getCriteria().entrySet()) {

            Object parsedPropertyValue = criteriaFromLine.getCriteria().get(criteriaProperty.getKey());

            if (criteriaProperty.getValue() instanceof String) {
                String StringCriteriaPropertyValue = (String) criteriaProperty.getValue();
                String StringParsedPropertyValue = (String) parsedPropertyValue;

                if (!StringCriteriaPropertyValue.equalsIgnoreCase(StringParsedPropertyValue)) {
                    return false;
                }

            } else {

                if (!criteriaProperty.getValue().equals(parsedPropertyValue)) {
                    return false;

                }
            }
        }

        return true;
    }

}

