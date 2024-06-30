package com.michael.valencia.prototypes.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.michael.valencia.prototypes.api.openapi.UsersApi;

@RestController
@RequestMapping("/v1")
public class UsersApiController implements UsersApi{

}
