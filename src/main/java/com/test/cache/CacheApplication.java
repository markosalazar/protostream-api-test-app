package com.test.cache;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.ProtoSchema;
import org.infinispan.protostream.annotations.ProtoSyntax;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.cache.model.User;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class CacheApplication {

	@ProtoSchema(schemaFileName = "simple.proto", includeClasses = User.class, schemaFilePath = "proto/",  schemaPackageName = "simple", syntax = ProtoSyntax.PROTO3)
   	public interface SimpleSchema extends GeneratedSchema {
   	}

	public static void main(String[] args) {
		SpringApplication.run(CacheApplication.class, args);
	}

}
