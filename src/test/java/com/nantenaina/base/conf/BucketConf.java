package com.nantenaina.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.nantenaina.base.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
