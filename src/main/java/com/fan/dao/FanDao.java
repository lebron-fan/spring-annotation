package com.fan.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile(value = "dev")
public class FanDao {
}
