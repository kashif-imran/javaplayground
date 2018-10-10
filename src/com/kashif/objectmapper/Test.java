package com.kashif.objectmapper;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Test {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException  {
		ObjectMapper mapper = new ObjectMapper();
		
		String policy = "{\"views\": [{\"id\": \"ob_family_details_section\", \"rows\": [{\"columns\": [{\"type\": \"hidden\", \"field\": \"nocategory.empFamily.cid\", \"notitle\": true, \"htmlClass\": \"col-placeholder\"}, {\"field\": \"empFamilyInfo.empFamily.name\", \"label\": \"Name\", \"htmlClass\": \"col-sm-4\", \"enableErrorState\": true, \"validationMessages\": {\"pattern\": \"Please enter a valid name\", \"maxLength\": \"Name cannot be greater than {{maximumLength}} characters\"}}, {\"type\": \"gtSelect\", \"field\": \"nocategory.empFamily.relationId\", \"label\": \"Relationship\", \"htmlClass\": \"col-sm-4\"}, {\"type\": \"gtDate\", \"field\": \"empFamilyInfo.empFamily.dob\", \"label\": \"DOB\", \"htmlClass\": \"col-sm-4\", \"dateOptions\": {\"dateFormat\": \"dd mmm yyyy\"}}]}, {\"columns\": [{\"type\": \"gtSelect\", \"field\": \"nocategory.empFamily.sexCode\", \"label\": \"Gender\", \"htmlClass\": \"col-sm-4\"}, {\"type\": \"gtSelect\", \"field\": \"nocategory.empFamily.bloodgroupId\", \"label\": \"Blood Group\", \"htmlClass\": \"col-sm-4\"}, {\"type\": \"gtSelect\", \"field\": \"nocategory.empFamily.nationalityId\", \"label\": \"Nationality\", \"htmlClass\": \"col-sm-4\"}]}], \"array\": true, \"title\": \"Family Details\", \"legend\": \"Member {{$index}}\", \"enabled\": true, \"editMode\": null, \"maxItems\": 5, \"viewType\": \"block\", \"nameField\": \"empFamilyInfo$empFamily$name\", \"orderable\": false, \"showTitle\": false, \"sortOrder\": \"0001\", \"description\": null, \"arrayButtonLabel\": \"Add another member\"}]}";
		
		Map<String, Object> readValue = mapper.readValue(policy, Map.class);
		System.out.println(readValue);
	}

}
