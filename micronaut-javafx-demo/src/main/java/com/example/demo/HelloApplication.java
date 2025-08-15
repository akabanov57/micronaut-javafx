package com.example.demo;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Requires;
import jakarta.inject.Inject;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import micronaut.javafx.launcher.api.ApplicationDelegate;
import micronaut.javafx.launcher.api.FxmlLoaderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Context
@Requires(beans = {FxmlLoaderFactory.class})
class HelloApplication implements ApplicationDelegate {

  private static final Logger log = LoggerFactory.getLogger(HelloApplication.class);

  private final FxmlLoaderFactory fxmlLoaderFactory;

  @Inject
  HelloApplication(FxmlLoaderFactory fxmlLoaderFactory) {
    this.fxmlLoaderFactory = fxmlLoaderFactory;
    log.debug("HelloApplication created: {}", this);
  }

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = fxmlLoaderFactory.get(HelloApplication.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 480, 240);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

}