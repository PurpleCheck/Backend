package purpleCheck.zeroError.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import purpleCheck.zeroError.newForm.UpdateStatusReqForm;
import purpleCheck.zeroError.newForm.OrderListResForm;
import purpleCheck.zeroError.newForm.UpdateStatusResForm;
import purpleCheck.zeroError.service.InspectionInfoService;

@Slf4j // 로깅
@RestController
@RequestMapping("/inspections/{inspectId}")
@RequiredArgsConstructor
public class InspectionInfoController {

    private final InspectionInfoService inspectionInfoService;

    @GetMapping
    public OrderListResForm orderList(@PathVariable long inspectId){
        return inspectionInfoService.getOrderListForm(inspectId);
    }
    @PatchMapping("/finish")
    public UpdateStatusResForm updateStatus(@PathVariable long inspectId, @RequestBody UpdateStatusReqForm updateStatusReqForm) {
        return inspectionInfoService.updateStatus(inspectId,updateStatusReqForm.isCompleteYN());
    }
}
