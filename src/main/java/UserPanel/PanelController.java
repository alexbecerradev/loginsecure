package UserPanel;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/v1")
@RequiredArgsConstructor
public class PanelController {

    @PostMapping(value = "userpanel")
    public String WelcomePanel (){
        return "Welcome user!";
    }
}
