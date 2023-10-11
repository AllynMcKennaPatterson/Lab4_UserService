package atu.cicd2.lab4_userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private RegistrationServiceClient registrationServiceClient;
//    private final AcknowledgeService acknowledgeService;

    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient){
        this.registrationServiceClient = registrationServiceClient;
    }
}
