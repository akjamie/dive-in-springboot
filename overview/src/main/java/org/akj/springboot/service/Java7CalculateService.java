package org.akj.springboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer calculate(Integer... values) {
        Integer sum = 0;

        if (null != values) {
            for (Integer i : values) {
                sum += i;
            }
        }

        return sum;
    }
}
