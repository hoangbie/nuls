package io.nuls.consensus.event.handler;

import io.nuls.consensus.cache.manager.tx.ReceivedTxCacheManager;
import io.nuls.consensus.entity.TxHashData;
import io.nuls.consensus.event.GetTxGroupEvent;
import io.nuls.consensus.event.SmallBlockEvent;
import io.nuls.core.chain.entity.NulsDigestData;
import io.nuls.core.context.NulsContext;
import io.nuls.event.bus.handler.AbstractEventHandler;
import io.nuls.event.bus.service.intf.EventBroadcaster;

import java.util.ArrayList;
import java.util.List;

/**
 * @author facjas
 * @date 2017/11/16
 */
public class SmallBlockHandler extends AbstractEventHandler<SmallBlockEvent> {
    private EventBroadcaster broadcaster = NulsContext.getInstance().getService(EventBroadcaster.class);
    private ReceivedTxCacheManager txCacheManager = ReceivedTxCacheManager.getInstance();

    @Override
    public void onEvent(SmallBlockEvent event, String fromId) {
        GetTxGroupEvent getTxGroupEvent = new GetTxGroupEvent();
        TxHashData data = new TxHashData();
        data.setBlockHash(event.getEventBody().getBlockHash());
        List<NulsDigestData> txHashList = new ArrayList<>();
        for (NulsDigestData txHash : event.getEventBody().getTxHashList()) {
            boolean exist = txCacheManager.txExist(txHash);
            if (!exist) {
                txHashList.add(txHash);
            }
        }
        data.setTxHashList(txHashList);
        getTxGroupEvent.setEventBody(data);
        broadcaster.sendToNode(getTxGroupEvent, fromId);
    }
}
