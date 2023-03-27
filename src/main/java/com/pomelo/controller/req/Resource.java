/**
  * Copyright 2023 bejson.com 
  */
package com.pomelo.controller.req;

import lombok.Data;

@Data
public class Resource {

//    @JsonProperty("original_type")
    private String originalType;
    private String algorithm;
    private String ciphertext;
//    @JsonProperty("associated_data")
    private String associatedData;
    private String nonce;
}