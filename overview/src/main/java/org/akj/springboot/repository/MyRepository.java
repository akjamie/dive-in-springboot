package org.akj.springboot.repository;

import org.akj.springboot.annotation.FirstLevelRepository;
import org.akj.springboot.annotation.SecondLevelRepository;

//@FirstLevelRepository(value = "myRepository")
@SecondLevelRepository(value = "myRepository")
public class MyRepository {
}
