package com.example.demo;

import java.util.NoSuchElementException;
import micronaut.javafx.launcher.api.JFXLauncher;

public class DemoLauncher {

  public static void main(String[] args) {
    JFXLauncher
        .findLauncher()
        .orElseThrow(() -> new NoSuchElementException("JFXLauncher not found."))
        .launch(args);
  }

}
