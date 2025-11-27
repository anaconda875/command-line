package org.springframework.boot;

import org.apache.commons.lang3.StringUtils;

public class SpringApplication {

  public static boolean isAllStringEmpty(String... str) {
    return StringUtils.isAllEmpty(str);
  }
}
