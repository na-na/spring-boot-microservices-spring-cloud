package io.corp.news.api.controllers;


import java.sql.Timestamp;
import java.util.Date;

import io.corp.news.api.domain.News;

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
		
		Timestamp todaysTimestamp = new Timestamp(System.currentTimeMillis() );		
		long end = System.currentTimeMillis() / 1000L;
		logger.info(new Date(todaysTimestamp.getTime()) +  String.valueOf(end));
		
		Timestamp beforeTimestamp = new Timestamp (System.currentTimeMillis() - 7 * 24 * 3600 * 1000L ); //Subtract n days 
		long start = System.currentTimeMillis() - 7 * 24 * 3600 * 1000L  ;
		logger.info(new Date(beforeTimestamp.getTime()) + String.valueOf(start/1000L));

		
		 News newsResponse = restTemplate
				.getForObject(
						"https://access.alchemyapi.com/calls/data/GetNews?apikey=7f3dd4e31d2499501cb1d87773d037d7ffb417dd&return=enriched.url.title,enriched.url.url,enriched.url.author,enriched.url.publicationDate,enriched.url.docSentiment&start="+String.valueOf(start/1000L)+"&end="+String.valueOf(end)+"&q.enriched.url.text="+domain+"&count=2&outputMode=json",
						News.class);
		 logger.info("https://access.alchemyapi.com/calls/data/GetNews?apikey=7f3dd4e31d2499501cb1d87773d037d7ffb417dd&return=enriched.url.title,enriched.url.url,enriched.url.author,enriched.url.publicationDate,enriched.url.docSentiment&start="+String.valueOf(start/1000L)+"&end="+String.valueOf(end)+"&q.enriched.url.text="+domain+"&count=2&outputMode=json");
		 logger.info("***********************\n"+newsResponse.getStatus()+"\n**********************\n"+newsResponse.getResult()+"**********************\n");
		 return newsResponse;
	}
}
