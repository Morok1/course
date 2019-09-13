package com.smagin.springcore.profile;

import com.smagin.springcore.primary.Vehicle;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sportDay")
public class Bike implements Vehicle { }
