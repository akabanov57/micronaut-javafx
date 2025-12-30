module micronaut.javafx.demo {
  requires demo.services;
  requires io.micronaut.micronaut_inject;
  requires jakarta.inject;
  requires jakarta.annotation;
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.graphics;
  requires micronaut.javafx.launcher;
  requires org.slf4j;

  // May be needed for @PostConstruct, @PreDestroy.
  //requires io.micronaut.micronaut_aop;

  exports com.example.demo;
  opens com.example.demo to javafx.fxml;
}