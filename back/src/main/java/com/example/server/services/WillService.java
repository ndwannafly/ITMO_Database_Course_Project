package com.example.server.services;

import com.example.server.POJO.WillsForPeopleResponse;
import com.example.server.entities.WillOwnerEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class WillService {


    public WillsForPeopleResponse getWillsForPeople(List<WillOwnerEntity> willOwnerEntityList){
        WillsForPeopleResponse willsForPeopleResponse = new WillsForPeopleResponse(0,0,0);
        willOwnerEntityList.forEach(p ->{
            switch (p.getWillId()){
                case 1:
                    willsForPeopleResponse.setWillArmament(p.getOwnerLevel());
                    break;
                case 2:
                    willsForPeopleResponse.setWillObservation(p.getOwnerLevel());
                    break;
                case 3:
                    willsForPeopleResponse.setWillRoyal(p.getOwnerLevel());
                    break;
                default:
                    break;
            }
        });

        return willsForPeopleResponse;

    }
}
