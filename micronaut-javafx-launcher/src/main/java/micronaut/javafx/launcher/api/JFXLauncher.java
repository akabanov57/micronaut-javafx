package micronaut.javafx.launcher.api;

import java.util.Optional;
import java.util.ServiceLoader;

public interface JFXLauncher {

  void launch(String[] args);

  void launch();

  static Optional<JFXLauncher> findLauncher() {
    return ServiceLoader.load(JFXLauncher.class).findFirst();
  }
}
