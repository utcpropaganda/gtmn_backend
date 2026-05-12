package com.gtmn_scheduler.gtmn_scheduler;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/healthcheck")
    public String checkHealth() {
        return "OK";
    }
}
