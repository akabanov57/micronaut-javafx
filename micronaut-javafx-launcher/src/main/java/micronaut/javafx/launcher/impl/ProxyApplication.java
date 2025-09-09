package micronaut.javafx.launcher.impl;

import javafx.application.Application;
import javafx.stage.Stage;
import micronaut.javafx.launcher.api.ApplicationDelegate;

/**
 * A JavaFX application that delegates calls to the ApplicationDelegate.
 * <p>
 * The visibility scope must be public.
 */
public final class ProxyApplication extends Application {

  private static ApplicationDelegate delegate;

  static void delegateTo(ApplicationDelegate delegate) {
    ProxyApplication.delegate = delegate;
  }

  @Override
  public void init() throws Exception {
    delegate.init();
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    delegate.start(primaryStage);
  }

  @Override
  public void stop() throws Exception {
    final ApplicationDelegate toStop = delegate;
    delegate = null;
    toStop.stop();
  }
}
