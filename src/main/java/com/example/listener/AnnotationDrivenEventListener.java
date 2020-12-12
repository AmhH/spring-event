package com.example.listener;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenEventListener {

  @Async
  @EventListener
  public void handleContextStart(ContextStartedEvent cse) {
    System.out.println("Handling context started event." + cse);
  }
}
