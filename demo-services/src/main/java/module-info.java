module demo.services {
  requires io.micronaut.micronaut_inject;
  requires io.micronaut.micronaut_core;

  // May be needed for @PostConstruct, @PreDestroy.
  //requires io.micronaut.micronaut_aop;

  requires jakarta.inject;
  requires org.slf4j;

  exports demo.services;
  exports services.impl;
}