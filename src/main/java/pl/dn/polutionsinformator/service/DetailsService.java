package pl.dn.polutionsinformator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class DetailsService {

    @Autowired
    RestTemplate restTemplate;

    public String getDetailsAboutWeatherAndPollution(){
        String detail = restTemplate.getForObject("api.airvisual.com/v2/city?city=Krakow&state=Lesser Poland Voivodeship&country=Poland&key=76002e3d-8e52-4a3d-a596-f523876cce0c", String.class);
        return detail;
    }
}
