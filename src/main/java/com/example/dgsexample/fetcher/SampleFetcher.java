package com.example.dgsexample.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

@DgsComponent
public class SampleFetcher {
    @DgsQuery
    public String sayHello(@InputArgument("name") String name) {
        return "Hello, " + name;
    }
}
