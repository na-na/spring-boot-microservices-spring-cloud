package io.corp.news.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Source {
	private Enriched enriched;

	public Enriched getEnriched() {
		return enriched;
	}

	public void setEnriched(Enriched enriched) {
		this.enriched = enriched;
	}
}
