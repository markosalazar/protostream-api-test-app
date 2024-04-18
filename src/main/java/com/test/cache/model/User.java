package com.test.cache.model;

import org.infinispan.protostream.annotations.ProtoField;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    @ProtoField(number = 1)
    String name;
}
