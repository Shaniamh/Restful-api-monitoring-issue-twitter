package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MonitoringIssueService {
 static Map<String,String> map = new HashMap<String,String>();
 
 public static void insert(String key, String value) {
  map.put(key, value);
 }
 
 public Map<String, String> getAll(){
	 try {
		 return map;
		 } catch(NullPointerException e) {
			 return null;
  }
 }
 
 public Entry<String, String> getByKey(String key){
  for (Entry<String,String> entry : map.entrySet()) {
   if(entry.getKey().equals(key)) {
    return entry;
   }
  }
  return null;
 }
}