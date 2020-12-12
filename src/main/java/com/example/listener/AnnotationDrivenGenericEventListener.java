package com.example.listener;

import com.example.event.GenericSpringEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenGenericEventListener {

  @EventListener(condition = "#event.success")
  public void handleSuccessful(GenericSpringEvent<String> event) {
    System.out.println("Handling generic event (conditional).");
  }
}
