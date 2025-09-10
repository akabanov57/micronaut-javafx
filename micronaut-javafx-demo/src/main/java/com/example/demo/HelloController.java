package com.example.demo;

import demo.services.Greeter;
import io.micronaut.context.annotation.Prototype;
import jakarta.inject.Inject;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Prototype scope indicates that a new instance of the bean is created each time it is injected.
 * <p>
 * An application may have multiple open windows of the same type. For example, gnome notepad may
 * have multiple files open for viewing or editing. In this case, @Prototype should be preferred
 * over @Singleton.
 *
 * @see <a href="https://docs.micronaut.io/latest/guide/#scopes">Micronaut Scopes</a>
 * @see <a
 * href="https://guides.micronaut.io/latest/micronaut-scope-types-gradle-java.html">Micronaut Scope
 * Types</a>
 */
@Prototype
final class HelloController {

  private static final Logger log = LoggerFactory.getLogger(HelloController.class);

  private final Greeter greeter;

  @Inject
  HelloController(Greeter greeter) {
    this.greeter = greeter;
  }

  @FXML
  private Label welcomeText;

  @FXML
  private void onHelloButtonClick() {
    greeter
        .greetAsync()
        .whenComplete((r, e) -> Platform.runLater(() -> welcomeText.setText(r)));
    log.debug("welcomeText installed.");
  }
}