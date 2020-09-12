package br.com.cep.mapper;

import br.com.cep.controller.dto.CidadeDto;
import br.com.cep.model.Cidade;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-12T14:54:52-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.8 (Ubuntu)"
)
@Component
public class CidadeMapperImpl implements CidadeMapper {

    @Override
    public Cidade toEntity(CidadeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Cidade cidade = new Cidade();

        cidade.setIbge( dto.getIbge() );
        cidade.setUf( dto.getUf() );
        cidade.setLocalidade( dto.getLocalidade() );

        return cidade;
    }

    @Override
    public CidadeDto toDto(Cidade entity) {
        if ( entity == null ) {
            return null;
        }

        CidadeDto cidadeDto = new CidadeDto();

        cidadeDto.setIbge( entity.getIbge() );
        cidadeDto.setUf( entity.getUf() );
        cidadeDto.setLocalidade( entity.getLocalidade() );

        return cidadeDto;
    }

    @Override
    public List<Cidade> toEntity(List<CidadeDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Cidade> list = new ArrayList<Cidade>( dtoList.size() );
        for ( CidadeDto cidadeDto : dtoList ) {
            list.add( toEntity( cidadeDto ) );
        }

        return list;
    }

    @Override
    public List<CidadeDto> toDto(List<Cidade> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CidadeDto> list = new ArrayList<CidadeDto>( entityList.size() );
        for ( Cidade cidade : entityList ) {
            list.add( toDto( cidade ) );
        }

        return list;
    }
}
