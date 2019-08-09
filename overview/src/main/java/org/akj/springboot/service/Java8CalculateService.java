package org.akj.springboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Stream;

@Profile("java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer calculate(Integer... values) {
        Integer sum = 0;

        if (null != values) {
            sum = Stream.of(values).reduce(0,Integer::sum);
        }

        return sum;
    }
}
