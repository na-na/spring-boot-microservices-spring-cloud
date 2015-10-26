package io.corp.pivotal.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Url {
	private String author;
	private String title;
	private String url;
	private DocSentiment docSentiment;
	
	public DocSentiment getDocSentiment() {
		return docSentiment;
	}
	public void setDocSentiment(DocSentiment docSentiment) {
		this.docSentiment = docSentiment;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
