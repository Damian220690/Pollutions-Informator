package pl.dn.polutionsinformator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.dn.polutionsinformator.service.DetailsService;

@Controller
@RequestMapping("/pollutions-weather")
public class MainController {

    @Autowired
    DetailsService detailsService;

    @GetMapping("/Krakow")
    @ResponseBody
    public String getInfo(){
        return detailsService.getDetailsAboutWeatherAndPollution();
    }
}
