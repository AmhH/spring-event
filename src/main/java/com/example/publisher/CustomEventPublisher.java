package com.example.publisher;

import com.example.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
  @Autowired
  private ApplicationEventPublisher eventPublisher;

  public void publishCustomEvent(final String message){
    System.out.println("Publishing custom event. ");
    CustomEvent event = new CustomEvent(this, message);
    eventPublisher.publishEvent(event);
  }

}
