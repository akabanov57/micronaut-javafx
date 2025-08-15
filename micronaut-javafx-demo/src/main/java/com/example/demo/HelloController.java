package com.example.demo;

import demo.services.Greeter;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.concurrent.ExecutionException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
class HelloController {

  private static final Logger log = LoggerFactory.getLogger(HelloController.class);

  private final Greeter greeter;

  @Inject
  HelloController(Greeter greeter) {
    this.greeter = greeter;
  }

  @FXML
  private Label welcomeText;

  @FXML
  protected void onHelloButtonClick() throws ExecutionException, InterruptedException {
//    greeter.greetAsync().whenComplete((r, e) -> welcomeText.setText(r));
    welcomeText.setText(greeter.greetAsync().get());
    log.debug("welcomeText installed.");
  }
}