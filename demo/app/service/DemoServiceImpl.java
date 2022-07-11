package service;

import com.google.inject.Singleton;
import controllers.dto.DemoDto;
import controllers.dto.DemoDtoResponse;

@Singleton

public class DemoServiceImpl implements DemoService{

    @Override
    public DemoDtoResponse displayName(DemoDto dto) {
        String name = dto.getName();
        String age = dto.getAge();
        String fullName = name;
        String agenew=age;

        DemoDtoResponse demoDtoResponse = DemoDtoResponse.builder()
                .fullName(fullName)
                .age(agenew)
                .build();
        return demoDtoResponse;
    }
}
