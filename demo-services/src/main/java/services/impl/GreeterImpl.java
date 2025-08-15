package services.impl;

import demo.services.Greeter;
import jakarta.inject.Singleton;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
final class GreeterImpl implements Greeter {

  private static final Logger log = LoggerFactory.getLogger(GreeterImpl.class);

  public String greet() {
    return "Добро пожаловать в JavaFX приложение! " + LocalDateTime.now();
  }

  public CompletableFuture<String> greetAsync() {
    return CompletableFuture.supplyAsync(() -> {
      log.debug("greetAsync()");
      return "Добро пожаловать в JavaFX приложение! " + LocalDateTime.now();});
  }
}
