/**
  * Copyright 2023 bejson.com 
  */
package com.pomelo.controller.req;

import lombok.Data;

@Data
public class Resource {

//    @JsonProperty("original_type")
    private String original_type;
    private String algorithm;
    private String ciphertext;
//    @JsonProperty("associated_data")
    private String associated_data;
    private String nonce;
}