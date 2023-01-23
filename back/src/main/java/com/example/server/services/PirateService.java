package com.example.server.services;

import java.time.LocalDate;
import java.util.*;

import com.example.server.POJO.PiratePeopleResponse;
import com.example.server.POJO.PirateRequest;
import com.example.server.POJO.WillsForPeopleResponse;
import com.example.server.entities.*;
import com.example.server.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PirateService {
    @Autowired
    private PirateRepository pirateRepository;

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private PirateTeamService pirateTeamService;

    @Autowired
    private DevilFruitOwnerService devilFruitOwnerService;

    @Autowired
    private WeaponOwnerService weaponOwnerService;

    @Autowired
    private WillOwnerService willOwnerService;

    @Autowired
    private DevilFruitService devilFruitService;

    @Autowired
    private TeamService teamService;

    @Autowired
    private WillService willService;

    @Autowired
    private WeaponService weaponService;

    public Map<Long, String> getPirateByID(Long id) {
        Map<Long, String> result = new HashMap<>();
        List<Long> list = pirateRepository.getPirateIdById(id);
        list.forEach(o -> result.put(o, pirateRepository.getPirateEntityById(id).getPersonId().toString()));
        return result;
    }

    public List<PirateEntity> getPirate(){
        return pirateRepository.getAll();
    }

    public Long getLastPirateId(){
        return pirateRepository.findTopByOrderByIdDesc().getId();
    }

    public Boolean addPirate(PirateRequest request) {
        // add person

        Long nextPeopleID = peopleService.getLastPeopleId() + 1;
        PeopleEntity peopleEntity = new PeopleEntity();

        System.out.println("nextPeopleID " + nextPeopleID);
        peopleEntity.setId(nextPeopleID);
        peopleEntity.setName(request.getName());
        peopleEntity.setHeight(request.getHeight());
        peopleEntity.setDate(LocalDate.parse(request.getBirthDate()));
        peopleService.addPeople(peopleEntity);

        // add pirate

        Long nextPirateID = this.getLastPirateId() + 1;
        PirateEntity pirateEntity = new PirateEntity();
        pirateEntity.setId(nextPirateID);
        pirateEntity.setCaptureReward(request.getCaptureReward());
        pirateEntity.setPersonId(nextPeopleID);
        pirateRepository.save(pirateEntity);

        PirateTeamEntity pirateTeamEntity = new PirateTeamEntity();
        pirateTeamEntity.setPirateId(nextPirateID);
        pirateTeamEntity.setTeamId(Long.valueOf(request.getTeamID()));
        pirateTeamEntity.setTitle(request.getTeamTitle());
        pirateTeamService.addPirate(pirateTeamEntity);

        DevilFruitsOwnerEntity devilFruitsOwnerEntity = new DevilFruitsOwnerEntity();
        devilFruitsOwnerEntity.setFruitId(Long.valueOf(request.getFruitID()));
        devilFruitsOwnerEntity.setOwnerLevel(request.getFruitOwnerLevel());
        devilFruitsOwnerEntity.setPersonId(nextPeopleID);
        devilFruitOwnerService.addDevilFruitsOwner(devilFruitsOwnerEntity);

        WeaponOwnerEntity weaponOwnerEntity = new WeaponOwnerEntity();
        weaponOwnerEntity.setWeaponId(Long.valueOf(request.getWeaponID()));
        weaponOwnerEntity.setPersonId(nextPeopleID);
        weaponOwnerEntity.setOwnerLavel(request.getWeaponOwnerLevel());
        weaponOwnerService.addWeaponOwner(weaponOwnerEntity);

        WillOwnerEntity  willOfArmsOwnerEntity = new WillOwnerEntity();
        willOfArmsOwnerEntity.setWillId(1);
        willOfArmsOwnerEntity.setPersonId(nextPeopleID);
        willOfArmsOwnerEntity.setOwnerLevel(request.getWillOfArmsLevel());
        willOwnerService.addWillOwner(willOfArmsOwnerEntity);

        WillOwnerEntity  willOfObservationOwnerEntity = new WillOwnerEntity();
        willOfObservationOwnerEntity.setWillId(2);
        willOfObservationOwnerEntity.setPersonId(nextPeopleID);
        willOfObservationOwnerEntity.setOwnerLevel(request.getWillOfObservation());
        willOwnerService.addWillOwner(willOfObservationOwnerEntity);

        WillOwnerEntity  willOfKingOwnerEntity = new WillOwnerEntity();
        willOfKingOwnerEntity.setWillId(3);
        willOfKingOwnerEntity.setPersonId(nextPeopleID);
        willOfKingOwnerEntity.setOwnerLevel(request.getWillOfKing());
        willOwnerService.addWillOwner(willOfKingOwnerEntity);

        return true;
    }

    public List<PirateEntity> getPirateCanDif(Integer sum){
        return pirateRepository.getPirateCanDif(sum);
    }

    public List<PiratePeopleResponse> getPirateResponse(List<PirateEntity> pirateEntities){
        List<PiratePeopleResponse> piratePeopleResponses = new ArrayList<>();

        pirateEntities.forEach(pirate -> {
            PeopleEntity peopleEntity = peopleService.getPeoplesById(pirate.getPersonId());

            DevilFruitsOwnerEntity devilFruitsOwnerEntity = devilFruitOwnerService.getDevilFruitsOwnerByPersonID(pirate.getPersonId());
            DevilFruitsEntity devilFruitsEntity = devilFruitService.getDevilFruitById(devilFruitsOwnerEntity.getFruitId());

            WeaponOwnerEntity weaponOwnerEntity = weaponOwnerService.getWeaponOwnerEntityByPersonId(pirate.getPersonId());
            WeaponEntity weaponEntity = weaponService.getWeaponEntutyById(weaponOwnerEntity.getWeaponId());

            List<WillOwnerEntity> willOwnerEntityList = willOwnerService.getWillOwnerEntitiesByPersonId(pirate.getPersonId());
            WillsForPeopleResponse willsForPeopleResponse = willService.getWillsForPeople(willOwnerEntityList);

            PirateTeamEntity pirateTeamEntity = pirateTeamService.getPirateTeamEntityByPirateId(pirate.getId());
            TeamEntity teamEntity = teamService.getTeamEntityById(pirateTeamEntity.getTeamId());


            PiratePeopleResponse piratePeopleResponse1 = new PiratePeopleResponse();

            piratePeopleResponse1.setId(peopleEntity.getId());
            piratePeopleResponse1.setPersonId(pirate.getPersonId());
            piratePeopleResponse1.setCaptureReward(pirate.getCaptureReward());
            piratePeopleResponse1.setDate(peopleEntity.getDate());
            piratePeopleResponse1.setName(peopleEntity.getName());
            piratePeopleResponse1.setHeight(peopleEntity.getHeight());

            piratePeopleResponse1.setDevilFruitsName(devilFruitsEntity.getName());
            piratePeopleResponse1.setDevilFruitsOwner(devilFruitsOwnerEntity.getOwnerLevel());
            piratePeopleResponse1.setDevilFruitId(devilFruitsEntity.getId());

            piratePeopleResponse1.setWeaponName(weaponEntity.getName());
            piratePeopleResponse1.setWeaponOwner(weaponOwnerEntity.getOwnerLavel());
            piratePeopleResponse1.setWeaponId(weaponEntity.getId());

            piratePeopleResponse1.setWillArmament(willsForPeopleResponse.getWillArmament());
            piratePeopleResponse1.setWillObservation(willsForPeopleResponse.getWillObservation());
            piratePeopleResponse1.setWillRoyal(willsForPeopleResponse.getWillRoyal());


            piratePeopleResponse1.setNumberTeam(teamEntity.getId());
            piratePeopleResponse1.setNameTeam(teamEntity.getName());
            piratePeopleResponse1.setImg(teamEntity.getImg());
            piratePeopleResponse1.setTitle(pirateTeamEntity.getTitle());
            piratePeopleResponses.add(piratePeopleResponse1);
        });

        Collections.sort(piratePeopleResponses, new Comparator<PiratePeopleResponse>() {
            @Override
            public int compare(PiratePeopleResponse o1, PiratePeopleResponse o2) {
                return o2.getCaptureReward() - o1.getCaptureReward();
            }
        });

        return piratePeopleResponses;

    }
}