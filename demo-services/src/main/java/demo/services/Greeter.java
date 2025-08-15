package demo.services;

import java.util.concurrent.CompletableFuture;

public interface Greeter {

  String greet();

  CompletableFuture<String> greetAsync();
}
