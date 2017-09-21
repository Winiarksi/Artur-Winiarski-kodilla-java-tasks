package Zadanie_14_5_Zadania_przy_uzyciu_PostMan;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/oilPainting")
public class OilPaintingController {

    @RequestMapping(method = RequestMethod.GET, value = "getOilPaintings")
    public List<OilPaintingDto> getOilPaintings(){
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getOilPainting")
    public OilPaintingDto getOilPaintingDto(String oilPaintingId){
        return new OilPaintingDto((long)1, "Daria Solar", "The Girls");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteOilPainting")
    public void deleteOilPainting(String oilPaintingId){

    }

    @RequestMapping(method = RequestMethod.POST, value = "upadteOilPainting")
    public OilPaintingDto updateOilPainting(OilPainting oilPainting){
        return new OilPaintingDto((long)2, "Vincent van Gogh", "Słoneczniki");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "createOilPainting")
    public void createOilPainting(OilPaintingDto oilPaintingDto){

    }

}
