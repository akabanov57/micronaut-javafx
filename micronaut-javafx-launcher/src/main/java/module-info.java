module micronaut.javafx.launcher {
  requires io.micronaut.micronaut_inject;
  requires io.micronaut.micronaut_core;
  requires jakarta.inject;
  requires javafx.fxml;
  requires javafx.graphics;

  exports micronaut.javafx.launcher.api;
  exports micronaut.javafx.launcher.jfx.impl;
  exports micronaut.javafx.launcher.impl to javafx.graphics;

  provides micronaut.javafx.launcher.api.JFXLauncher with micronaut.javafx.launcher.impl.MicronautJFXLauncher;
  uses micronaut.javafx.launcher.api.JFXLauncher;
}