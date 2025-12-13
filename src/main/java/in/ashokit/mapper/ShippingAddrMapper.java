package in.ashokit.mapper;

import in.ashokit.dto.ShippingAddrDto;
import in.ashokit.entity.ShippingAddressEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingAddrMapper {

    @Autowired
    public static ModelMapper mapper;

    public static ShippingAddrDto convertToDto(ShippingAddressEntity addrEntity){
        return mapper.map(addrEntity, ShippingAddrDto.class);
    }

    public static ShippingAddressEntity convertToEntity(ShippingAddrDto addrDto){
        return mapper.map(addrDto,ShippingAddressEntity.class);
    }
}


