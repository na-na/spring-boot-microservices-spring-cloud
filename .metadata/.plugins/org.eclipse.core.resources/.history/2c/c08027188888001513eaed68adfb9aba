package io.corp.pivotal.services;

import io.corp.pivotal.CorpinfoApplication;
import io.corp.pivotal.domain.Company;
import io.corp.pivotal.domain.News;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StoreService {

	
	private static final Logger log = LoggerFactory.getLogger(CorpinfoApplication.class);

	@RequestMapping("/companies")
    public List<Company> remoteList()  {
		RestTemplate restt = new RestTemplate();
		return restt.getForObject("http://localhost:8087/companies", ArrayList.class);
		/*HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(
				"http://localhost:8085/companies");

		client.executeMethod(method);

		byte[] responsebody = method.getResponseBody();
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(responsebody, ArrayList.class);*/
		
		 

	}
}
