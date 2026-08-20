package com.cabs.mining.accounts.api;

import com.cabs.mining.accounts.api.dto.RegisterRequest;
import com.cabs.mining.accounts.api.dto.RegisterResponse;
import com.cabs.mining.accounts.domain.AccountService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AccountService accountService;



    @Operation(summary = "Register a new user account")
    @PostMapping({"/register","/register/"})
    public ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request){
        accountService.register(request.email(), request.password());
        return ResponseEntity.ok(new RegisterResponse(true,"OK"));
    }

}
