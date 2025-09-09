package micronaut.javafx.launcher.api;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * SPI. The class implementing this interface runs micronaut and then javafx.
 */
public interface JFXLauncher {

  /**
   * Launch micronaut and javafx.
   *
   * @param args command line arguments.
   */
  void launch(String[] args);

  /**
   * Launch micronaut and javafx.
   */
  void launch();

  /**
   * Find SPI implementation.
   *
   * @return JFXLauncher.
   */
  static Optional<JFXLauncher> findLauncher() {
    return ServiceLoader.load(JFXLauncher.class).findFirst();
  }
}
