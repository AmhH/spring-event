package com.example.listener;

import com.example.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * synchronous
 */
@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {

  @Override
  public void onApplicationEvent(CustomEvent event) {
    System.out.println("Received spring custom event - " + event.getMessage());
  }
}
