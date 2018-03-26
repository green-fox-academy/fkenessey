package com.greenfoxacademy.matchmaking.services;

import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class SlackService {

//  String url = System.getenv("SLACK_WEBHOOK_URL");
  private final String link = "https://hooks.slack.com/services/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";

  private static final String POST = "POST";
  private static final String PAYLOAD = "payload=";
  private static final String UTF_8 = "UTF-8";

  public SlackService() {
  }

//  public void call(SlackMessage message) {
//    if (message != null) {
//      this.send(message.prepare());
//    }
//  }

  public void send(String message) {

    CloseableHttpClient client = HttpClients.createDefault();
    HttpPost httpPost = new HttpPost(link);

    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("text", message);

    try {
      StringEntity entity = new StringEntity(jsonObject.toString());
      httpPost.setEntity(entity);
      httpPost.setHeader("Content-type", "application/json");
      CloseableHttpResponse response = client.execute(httpPost);
      client.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
