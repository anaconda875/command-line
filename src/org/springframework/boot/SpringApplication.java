package org.springframework.boot;

import org.apache.commons.lang3.StringUtils;

public class SpringApplication {

  public static boolean isStringEmpty(String str) {
    return StringUtils.isEmpty(str);
  }
}
