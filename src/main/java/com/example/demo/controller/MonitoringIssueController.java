package com.example.demo.controller;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MonitoringIssueService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.protobuf.TextFormat.ParseException;

@RestController
public class MonitoringIssueController {
  @RequestMapping(value = "/hbase/monitoring/issue", method = RequestMethod.GET)
  public ResponseEntity<Map<String,String>> monitoring(@RequestParam(value = "date") String key, @RequestParam(value = "tableName") String tableName) throws ParseException, JsonParseException, JsonMappingException, IOException{
  Map<String,String> map = new HashMap<String,String>();
  HbaseController hbase = new HbaseController();
  DateFormat df = new SimpleDateFormat("HHmm");
  Calendar cal = Calendar.getInstance();
  String newValue;
  MonitoringIssueService service = new MonitoringIssueService();
  cal.set(Calendar.HOUR_OF_DAY, 0);
  cal.set(Calendar.MINUTE, 0);
  int startDate = cal.get(Calendar.DATE);
  int i=0;
  while (i++!=48) {
      //System.out.println(df.format(cal.getTime()));
      cal.add(Calendar.MINUTE, 30);
      String time = key + df.format(cal.getTime());
      service.insert(time, "0");
  }
  map = service.getAll();
  for (Entry<String, String> entry : map.entrySet()) {
	  newValue = hbase.scanRowKey(entry.getKey(), tableName);
	  entry.setValue(newValue);   
     }
  for (Entry<String, String> entry : map.entrySet()) {
	  System.out.println(entry.getKey());
  }
return new ResponseEntity<Map<String,String>>(map, HttpStatus.OK);
 }
}