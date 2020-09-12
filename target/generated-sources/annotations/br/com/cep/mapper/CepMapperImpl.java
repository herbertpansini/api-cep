package br.com.cep.mapper;

import br.com.cep.controller.dto.CepDto;
import br.com.cep.model.Cep;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-12T14:54:52-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.8 (Ubuntu)"
)
@Component
public class CepMapperImpl implements CepMapper {

    @Autowired
    private CidadeMapper cidadeMapper;

    @Override
    public Cep toEntity(CepDto dto) {
        if ( dto == null ) {
            return null;
        }

        Cep cep = new Cep();

        cep.setCep( dto.getCep() );
        cep.setLogradouro( dto.getLogradouro() );
        cep.setComplemento( dto.getComplemento() );
        cep.setBairro( dto.getBairro() );
        cep.setCidade( cidadeMapper.toEntity( dto.getCidade() ) );

        return cep;
    }

    @Override
    public CepDto toDto(Cep entity) {
        if ( entity == null ) {
            return null;
        }

        CepDto cepDto = new CepDto();

        cepDto.setCep( entity.getCep() );
        cepDto.setLogradouro( entity.getLogradouro() );
        cepDto.setComplemento( entity.getComplemento() );
        cepDto.setBairro( entity.getBairro() );
        cepDto.setCidade( cidadeMapper.toDto( entity.getCidade() ) );

        return cepDto;
    }

    @Override
    public List<Cep> toEntity(List<CepDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Cep> list = new ArrayList<Cep>( dtoList.size() );
        for ( CepDto cepDto : dtoList ) {
            list.add( toEntity( cepDto ) );
        }

        return list;
    }

    @Override
    public List<CepDto> toDto(List<Cep> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CepDto> list = new ArrayList<CepDto>( entityList.size() );
        for ( Cep cep : entityList ) {
            list.add( toDto( cep ) );
        }

        return list;
    }
}
