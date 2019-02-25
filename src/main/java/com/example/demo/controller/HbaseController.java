package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Tweet;
import com.example.demo.service.MonitoringIssueService;
import com.example.demo.service.TweetService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HbaseController {
	TweetService tweetService = new TweetService();
	public String scanRowKey(String rowKey, String tableName) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj = new ObjectMapper();
		Tweet tweet = new Tweet();
		String newValue;
		List<Cell> result = tweetService.scanRegexRowKey(tableName, rowKey);
		if (null==result) {
			return "0";
		} else {
			for (Cell cell : result) {
				String tempValue = String.valueOf(Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength()));
				tweet = obj.readValue(tempValue, Tweet.class);
			}
			return "1";
		}
		
	}
}
