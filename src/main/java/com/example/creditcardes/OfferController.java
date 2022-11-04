package com.example.creditcardes;

import com.example.creditcardes.models.Profile;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {
    @Autowired
    private KieSession session;

    @PostMapping("/getOffer")
    public Profile getOffer(@RequestBody Profile profile){
        System.out.println("Request body: "+profile.toString());
        session.insert(profile);
        session.fireAllRules();
        System.out.println("Result:"+profile.toString());
        return profile;
    }
}
