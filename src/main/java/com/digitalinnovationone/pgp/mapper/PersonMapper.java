package com.digitalinnovationone.pgp.mapper;

import com.digitalinnovationone.pgp.dto.request.PersonDTO;
import com.digitalinnovationone.pgp.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    default Person toModel(PersonDTO personDTO) {
        return null;
    }

    default PersonDTO toDTO(Person person) {
        return null;
    }
}
