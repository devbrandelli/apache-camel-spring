package com.github.felipebrandelli.apachecamel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class apigeeRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    }
}
