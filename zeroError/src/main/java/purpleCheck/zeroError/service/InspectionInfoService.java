package purpleCheck.zeroError.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import purpleCheck.zeroError.domain.entity.InspectInfo;
import purpleCheck.zeroError.exception.NoSuchInspectIdFoundException;
import purpleCheck.zeroError.exception.UpdateFailException;
import purpleCheck.zeroError.newForm.OrderItemForm;
import purpleCheck.zeroError.newForm.OrderListResForm;
import purpleCheck.zeroError.newForm.OrderItemDto;
import purpleCheck.zeroError.newForm.UpdateStatusResForm;
import purpleCheck.zeroError.repository.InspectInfoRepository;
import purpleCheck.zeroError.repository.OrderItemRepository;
import purpleCheck.zeroError.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InspectionInfoService {

    private final InspectInfoRepository inspectInfoRepository;
    private final OrderItemRepository orderItemRepository;
    private final OrderRepository orderRepository;

    public OrderListResForm getOrderListForm(long id) {
        InspectInfo inspectInfo = inspectInfoRepository.findById(id);

        if (inspectInfo==null){
            throw new NoSuchInspectIdFoundException("no such inspectId");
        }

        long orderId = inspectInfo.getOrder().getId();
        String trackingId = inspectInfo.getTracking().getId();
        List<OrderItemDto> orderItems = orderItemRepository.findById(orderId);
        List<OrderItemForm> orderItemForms = new ArrayList<>();
        for (OrderItemDto oi: orderItems){
            orderItemForms.add(new OrderItemForm(oi));
        }
        int totalCount = orderRepository.findById(orderId).getTotalCount();
        return new OrderListResForm(id, orderId, trackingId, orderItemForms, totalCount);
    }

    @Transactional
    public UpdateStatusResForm updateStatus(long id, boolean completeYN) {
        InspectInfo inspectInfo = inspectInfoRepository.findById(id);

        if (inspectInfo==null){
            throw new NoSuchInspectIdFoundException("no such inspectId");
        }

        boolean isUpdate = inspectInfo.updateCompStatus(completeYN);

        if (!isUpdate){
            throw new UpdateFailException("fail to update status");
        }

        return new UpdateStatusResForm(isUpdate);

    }


}
