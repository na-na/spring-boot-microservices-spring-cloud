package io.corp.news.api.controllers;

import io.corp.news.api.domain.News;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NewsApiController {
    private static final Logger logger = Logger.getLogger(NewsApiController.class);

	@RequestMapping(value = "news/{companyDomain}", method = RequestMethod.GET)
	public News getOrgInfo(@PathVariable String companyDomain) {

		String domain = companyDomain.substring(4);
		logger.info(domain);
		RestTemplate restTemplate = new RestTemplate();
		 News newsResponse = restTemplate
				.getForObject(
						"https://access.alchemyapi.com/calls/data/GetNews?apikey=ae452c36b03caa003000232fe86a835d02362022&return=enriched.url.title,enriched.url.url,enriched.url.author,enriched.url.publicationDate,enriched.url.docSentiment&start=1444348800&end=1445036400&q.enriched.url.text="+domain+"&count=2&outputMode=json",
						News.class);
		 
		 logger.info("***********************\n"+newsResponse.getStatus()+"\n**********************\n"+newsResponse.getResult()+"**********************\n");
		 return newsResponse;
	}
}
