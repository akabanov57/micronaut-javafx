package micronaut.javafx.launcher.impl;

import io.micronaut.context.BeanContext;
import javafx.application.Application;
import micronaut.javafx.launcher.api.ApplicationDelegate;
import micronaut.javafx.launcher.api.JFXLauncher;

public class MicronautJFXLauncher implements JFXLauncher {

  @Override
  public void launch(String[] args) {
    try (BeanContext ctx = BeanContext.run()) {
      ProxyApplication.delegateTo(ctx.getBean(ApplicationDelegate.class));
      Application.launch(ProxyApplication.class, args);
    }
  }

  @Override
  public void launch() {
    launch(new String[]{});
  }
}
