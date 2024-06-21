package insurance.infra;

import insurance.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/receipts")
@Transactional
public class ReceiptController {

    @Autowired
    ReceiptRepository receiptRepository;

    @RequestMapping(
        value = "receipts/",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Receipt requestClaim(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody Receipt receipt
    ) throws Exception {
        System.out.println("##### /receipt/requestClaim  called #####");
        receipt.requestClaim(requestClaimcommand);
        receiptRepository.save(receipt);
        return receipt;
    }
}
//>>> Clean Arch / Inbound Adaptor
