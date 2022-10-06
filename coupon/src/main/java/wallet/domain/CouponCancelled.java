package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponCancelled extends AbstractEvent {

    private Long id;
    private Long price;
    private String buyer;
    private String name;

    public CouponCancelled(Coupon aggregate){
        super(aggregate);
    }
    public CouponCancelled(){
        super();
    }
}
