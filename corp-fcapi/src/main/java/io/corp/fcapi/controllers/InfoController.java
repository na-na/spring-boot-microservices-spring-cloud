package io.corp.fcapi.controllers;

import io.corp.fcapi.domain.Company;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InfoController {

		
    private static final Logger logger = Logger.getLogger(InfoController.class);
	@RequestMapping(value = "/info/{companyDomain}", method = RequestMethod.GET)
	public Company getOrgInfo(@PathVariable String companyDomain) throws HttpException, IOException {

	    logger.info(companyDomain);
		RestTemplate restTemplate = new RestTemplate();
		 return restTemplate
				.getForObject(
						"http://api.fullcontact.com/v2/company/lookup.json?domain="+companyDomain+".com&apiKey=faed8a75dc569577",
						Company.class);
		 
	}

}