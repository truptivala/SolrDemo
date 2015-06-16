package com.solr;

import java.net.MalformedURLException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

public class SolrTest {

	public static void main(String[] args) throws MalformedURLException, SolrServerException 
	{
        HttpSolrServer solr = new HttpSolrServer("http://localhost:8983/solr/rssRep");

        SolrQuery query = new SolrQuery();
        query.setQuery("title:software engineer");
        
        QueryResponse response = solr.query(query);
        SolrDocumentList results = response.getResults();
        for (int i = 0; i < results.size(); ++i) {
          System.out.println(results.get(i));
        }
      }
}
