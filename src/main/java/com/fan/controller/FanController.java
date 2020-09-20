package com.fan.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile(value = "test")
public class FanController {
}
